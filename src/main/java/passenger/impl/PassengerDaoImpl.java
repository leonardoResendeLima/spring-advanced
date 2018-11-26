package passenger.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import passenger.dao.PassengerDao;
import passenger.dao.rowmapper.PassengerRowMapper;
import passenger.dto.Passenger;

import java.util.List;

@Component
public class PassengerDaoImpl implements PassengerDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int create(Passenger passenger) {
        String sql = "insert into passenger values(?,?,?)";
        int result = jdbcTemplate.update(
                sql,
                passenger.getId(),
                passenger.getFirstName(),
                passenger.getLastName());
        return result;
    }

    @Override
    public List<Passenger> read() {
        String sql = "select * from passenger";
        PassengerRowMapper passengerRowMapper = new PassengerRowMapper();
        List<Passenger> passengers = jdbcTemplate.query(sql, passengerRowMapper);
        return passengers;
    }

    @Override
    public Passenger read(int id) {
        String sql = "select * from passenger where id=?";
        PassengerRowMapper passengerRowMapper = new PassengerRowMapper();
        Passenger passengers = jdbcTemplate.queryForObject(sql, passengerRowMapper, id);
        return passengers;
    }

    @Override
    public int update(Passenger passenger) {
        String sql = "update passenger set firstName=?, lastName=? where id=?";
        int result = jdbcTemplate.update(
                sql,
                passenger.getFirstName(),
                passenger.getLastName(),
                passenger.getId());
        return result;
    }

    @Override
    public int delete(int id) {
        String sql = "delete from passenger where id=?";
        int result = jdbcTemplate.update(sql, id);
        return result;

    }
}
