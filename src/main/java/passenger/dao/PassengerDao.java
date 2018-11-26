package passenger.dao;

import passenger.dto.Passenger;

import java.util.List;

public interface PassengerDao {
    int create(Passenger passenger);

    List<Passenger> read();

    Passenger read(int id);

    int update(Passenger passenger);

    int delete(int id);

}
