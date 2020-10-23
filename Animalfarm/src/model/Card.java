package model;

import java.time.LocalDate;

public class Card {
    private Employee employee;
    private LocalDate dueDate;
    private final String ID;

    public Card(LocalDate dueDate, String ID) {
        this.dueDate = dueDate;
        this.ID = ID;
    }

    public boolean isValid(LocalDate cardTime) {
        return cardTime.isBefore(dueDate);
    }
}
