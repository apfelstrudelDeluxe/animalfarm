package model;

import java.util.ArrayList;
import java.util.List;

public class Warehouse extends Employee  {
    private final double bonus;
    private final List<String> licenses;

    public Warehouse (String firstName, String secondName, int svn,Address address, String sex, int salary,  Location location , double bonus, List<String> licenses) {
        super(firstName, secondName, svn, address, sex, salary, location);
        this.bonus = bonus;
        this.licenses = licenses;
    }
    public Warehouse (Employee emp, double bonus) {
        super(emp.getFirstName(), emp.getSecondName(), emp.getSvn(), emp.getAddress(), emp.getSex(), emp.getSalary(), emp.getLocation());
        this.bonus = bonus;
        this.licenses = new ArrayList<>();
    }

    public double getBonus() {
        return bonus;
    }

    public List<String> getLicenses() {
        return licenses;
    }
}
