package model;

import java.util.UUID;

public class Cashier extends Sale{

    private String keyId;
    private String cashierStation;
    private double revenue;

    public Cashier(String firstName, String secondName, int svn, Address address , String sex, int salary, Location location, boolean teamlead, String specialisation, String cashierStation, double revenue) {
        super(firstName, secondName, svn, location, sex, salary, address, teamlead, specialisation);
        this.keyId = UUID.randomUUID().toString();
        this.cashierStation = cashierStation;
        this.revenue = revenue;
    }

    public String getKeyId() {
        return keyId;
    }

    public String getCashierStation() {
        return cashierStation;
    }

    public double getRevenue() {
        return revenue;
    }
}



