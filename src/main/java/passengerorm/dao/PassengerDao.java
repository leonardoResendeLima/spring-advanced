package passengerorm.dao;

import passengerorm.entity.Passenger;

import java.util.List;

public interface PassengerDao {
    List<Passenger> findAll();

    Passenger findOne(int id);

    void update(Passenger passenger);

    void create(Passenger passenger);

    void delete(Passenger passenger);
}
