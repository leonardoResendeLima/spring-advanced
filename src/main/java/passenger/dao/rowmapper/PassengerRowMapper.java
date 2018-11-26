package passenger.dao.rowmapper;

import org.springframework.jdbc.core.RowMapper;
import passenger.dto.Passenger;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PassengerRowMapper implements RowMapper<Passenger> {

    @Override
    public Passenger mapRow(ResultSet resultSet, int i) throws SQLException {
        Passenger passenger = new Passenger(
                resultSet.getInt(1),
                resultSet.getString(2),
                resultSet.getString(3)
        );
        return passenger;
    }
}
