package model;

import java.time.LocalDate;
import java.util.UUID;

public class CoffeeCard extends Card {
    private double credit;

    public CoffeeCard(LocalDate dueDate, double credit) {
        super(dueDate, "c" + UUID.randomUUID());
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit += credit;
    }
}
