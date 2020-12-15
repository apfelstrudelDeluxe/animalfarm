package model;

import java.util.UUID;

public class Location {

    private Address address;
    private String ID;

    public Location(Address address) {
       this.address = address;
       ID = UUID.randomUUID().toString();
    }


    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Location{" +
                "address=" + address +
                ", ID='" + ID + '\'' +
                '}';
    }
}
