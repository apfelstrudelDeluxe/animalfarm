import java.util.UUID;

public class Cashier extends Sale{

    private String keyId;
    private String cashierStation;
    private double revenue;

    public Cashier(String firstName, String secondName, int svn, Location location, String sex, int salary, Address address, boolean teamlead, String specialisation, String keyId, String cashierStation, double revenue) {
        super(firstName, secondName, svn, location, sex, salary, address, teamlead, specialisation);
        this.keyId = keyId;
        this.cashierStation = UUID.randomUUID().toString();
        this.revenue = revenue;
    }
}



