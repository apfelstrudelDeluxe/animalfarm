package model;

import java.util.List;

public class Boss extends Employee {
    private final List<Employee> employees;
    private String car;
    private String office;

    //hier der Konstruktor wird zum Teil aus dem model.Employee übernommen und die "extra Eigenschaften am Ende angefügt.
    public Boss(String firstName, String secondName, int svn, Location location, String sex, int salary, Address address, String car, String office, List<Employee> employees) {
        super(firstName, secondName, svn, location, sex, salary, address);
        this.employees = employees;
        this.car = car;
        this.office = office;
    }
}