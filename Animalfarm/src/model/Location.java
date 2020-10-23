package model;

public class Location {

    private String address;
    private String city;
    private int zip;
    private String country;

    public Location(String address, String city, int zip, String country) {
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Location{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                ", country='" + country + '\'' +
                '}';
    }

}
