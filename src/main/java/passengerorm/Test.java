package passengerorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import passengerorm.dao.PassengerDao;
import passengerorm.entity.Passenger;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("passengerorm_config.xml");
        PassengerDao passengerDao = (PassengerDao) context.getBean("passenger");

        // Passenger passenger = new Passenger(1, "Leonardo", "Lima");

        /*Find All*/
        /*List<Passenger> passengers = passengerDao.findAll();
        System.out.println(passengers);*/

        /*Find One*/
        /*Passenger passenger = passengerDao.findOne(1);
        System.out.println(passenger);*/

        /*Save*/
        // passengerDao.create(passenger);

        /*Delete*/
        //passengerDao.delete(passenger);

        /*Update*/
        Passenger passenger = new Passenger(1, "Leonardo", "Resende");
        passengerDao.update(passenger);
    }
}
