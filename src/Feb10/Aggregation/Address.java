package Feb10.Aggregation;

public class Address {
    String streetNumber;
    String  streetName;
    String city;
    String country;
    String postalCode;

    public Address(String streetNumber, String streetName, String city, String country, String postalCode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }
}
