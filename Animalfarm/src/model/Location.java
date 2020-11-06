package model;

import java.util.UUID;

public class Location {

    private Address address;
    private String ID;

    public Location(Address address) {
       this.address = address;
       ID = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Location{" +
                "address=" + address +
                ", ID='" + ID + '\'' +
                '}';
    }
}
