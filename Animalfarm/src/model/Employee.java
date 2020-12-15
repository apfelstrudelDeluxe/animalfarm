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
    private CoffeeCard coffeeCard;
    private KeyCard keyCard;

    public Employee(String firstName, String secondName, int svn, Address address, String sex, int salary, Location location, CoffeeCard coffeeCard) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.svn = svn;
        this.location = location;
        this.sex = sex;
        this.salary = salary;
        this.address = address;
        this.coffeeCard = coffeeCard;
        this.keyCard = new KeyCard();           // neue leere Liste für mehrere Zugänge
        keyCard.addAccessPoint(location);       // 1x KeyCard hinzufügen mit Arbeitsplatz
    }

    public KeyCard getKeyCard() {
        return keyCard;
    }

    public void setKeyCard(KeyCard keyCard) {
        this.keyCard = keyCard;
    }

    public CoffeeCard getCoffeeCard() {
        return coffeeCard;
    }

    public int getSvn() {
        return svn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSvn(int svn) {
        this.svn = svn;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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


}
