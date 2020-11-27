package model;

public class Sale extends Employee {

    private boolean teamlead;
    private String specialisation;

    public Sale(String firstName, String secondName, int svn, Location location, String sex, int salary, Address address, boolean teamlead, String specialisation, CoffeeCard coffeeCard) {
        super(firstName, secondName, svn, address, sex, salary, location, coffeeCard); // standardmäßig 15,-
        this.teamlead = teamlead;
        this.specialisation = specialisation;
    }
}
