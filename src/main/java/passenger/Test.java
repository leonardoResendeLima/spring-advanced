package passenger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import passenger.dao.PassengerDao;
import passenger.dto.Passenger;
import passenger.impl.PassengerDaoImpl;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("passenger_config.xml");
        PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDaoImpl");

        Passenger passenger = new Passenger(2,"Isabelle", "Portes");
        // int result = passengerDao.create(passenger);
        // int result = passengerDao.update(passenger);
        // int result = passengerDao.delete(1);
        // List<Passenger> passengers = passengerDao.read();
        Passenger passengers = passengerDao.read(1);

        // System.out.println("Number of records updated : " + result);
        System.out.println("Passenger(s) : " + passengers);
    }
}
