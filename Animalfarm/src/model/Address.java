package model;

public class Address {
    private final String city;
    private final int postcode;
    private final String houseNumber;
    private final String street;
    private final String country;

    public Address(String city, int postcode, String houseNumber, String street, String country) {
        this.city = city;
        this.postcode = postcode;
        this.houseNumber = houseNumber;
        this.street = street;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getHousenumber() {
        return houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", postcode=" + postcode +
                ", houseNumber='" + houseNumber + '\'' +
                ", street='" + street + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
