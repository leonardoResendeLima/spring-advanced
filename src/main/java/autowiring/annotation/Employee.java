package autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    @Autowired(required = false)
    @Qualifier("addressCampinas")
    private Address address;

    public Employee(Address address) {
        this.address = address;
    }

    public Employee() {

    }

    public Address getAdress() {
        return address;
    }


    public void setAdress(Address adress) {
        this.address = adress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "adress=" + address +
                '}';
    }
}
