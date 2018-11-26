package autowiring;

public class Employee {
   private Address address;

    public Employee(Address address) {
        this.address = address;
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
