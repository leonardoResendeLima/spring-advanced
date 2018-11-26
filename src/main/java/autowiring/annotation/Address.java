package autowiring.annotation;

public class Address {
    private String Street;
    private String HouseNumber;
    private String City;

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getHouseNumber() {
        return HouseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        HouseNumber = houseNumber;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Street='" + Street + '\'' +
                ", HouseNumber='" + HouseNumber + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}
