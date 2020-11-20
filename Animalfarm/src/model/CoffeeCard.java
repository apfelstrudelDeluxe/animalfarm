package model;

import java.time.LocalDate;
import java.util.UUID;

public class CoffeeCard extends Card {
    private double credit;

    public CoffeeCard(Employee employee, double credit) {
        super("c" + UUID.randomUUID(), employee);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit += credit;
    }
}
