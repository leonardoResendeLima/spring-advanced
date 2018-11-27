package passengerorm.dao.impl;

import org.springframework.transaction.annotation.Transactional;
import passengerorm.dao.PassengerDao;
import passengerorm.entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("passenger")
public class PassengerDaoImpl implements PassengerDao {

    @Autowired
    HibernateTemplate hibernateTemplate;

    @Override
    public List<Passenger> findAll() {
        List<Passenger> passengers = hibernateTemplate.loadAll(Passenger.class);
        return passengers;
    }

    @Override
    public Passenger findOne(int id) {
        Passenger passenger = hibernateTemplate.get(Passenger.class, id);
        return passenger;
    }

    @Override
    @Transactional
    public void update(Passenger passenger) {
        hibernateTemplate.update(passenger);
    }

    @Override
    @Transactional
    public void create(Passenger passenger) {
        hibernateTemplate.save(passenger);
    }

    @Override
    @Transactional
    public void delete(Passenger passenger) {
        hibernateTemplate.delete(passenger);
    }
}
