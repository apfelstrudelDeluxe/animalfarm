import java.util.Collections;
import java.util.List;

public class Warehouse extends Employee  {
    private final double bonus;
    private final List<Employee> employees;

    public Warehouse (String firstName, String secondName, int svn, Location location, String sex, int salary, Address address, double bonus; List<Employee> employees) {
        super(firstName, secondName, svn, location, sex, salary, address);

        this.bonus = bonus;
        this.employees = Collections.emptyList();
    }
}
