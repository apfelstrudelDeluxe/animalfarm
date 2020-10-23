package model;

import java.util.Random;

public class Employee {

    private String firstName;
    private String secondName;
    private int svn;
    private Location location;
    private String sex;
    private int salary;
    private Address address;
    private final String ID;

    public Employee(String firstName, String secondName, int svn, Location location, String sex, int salary, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.svn = svn;
        this.location = location;
        this.sex = sex;
        this.salary = salary;
        this.address = address;
        this.ID = secondName + new Random().nextInt(1000);
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "model.Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", svn=" + svn +
                ", location=" + location +
                ", sex='" + sex + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Employee){

          return ((Employee) obj).ID.equals(this.ID);

        }

        return false;
    }
}