import java.util.Collections;
import java.util.List;

public class Warehouse extends Employee  {
    private final double bonus;
    private final List<String> licenses;

    public Warehouse (String firstName, String secondName, int svn, Location location, String sex, int salary, Address address, double bonus, List<String> licenses) {
        super(firstName, secondName, svn, location, sex, salary, address);
        this.bonus = bonus;
        this.licenses = licenses;
    }
}
