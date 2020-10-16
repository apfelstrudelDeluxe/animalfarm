import java.util.UUID;

public class Cashier {

    private String keyId;
    private String cashierStation;
    private double revenue;

    public Cashier(String keyId, String cashierStation, double revenue) {
        this.keyId = keyId;
        this.cashierStation = UUID.randomUUID().toString();;
        this.revenue = revenue;
    }
}
