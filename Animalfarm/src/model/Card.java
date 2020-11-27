package model;

import java.time.LocalDate;

public class Card {
    private LocalDate dueDate;
    private final String ID;

    public Card(String ID) {
        dueDate = LocalDate.now();
        // expire in one year
        dueDate = dueDate.plusYears(1);
        this.ID = ID;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isValid(LocalDate cardTime) {
        return cardTime.isBefore(dueDate);
    }

    public String getID() {
        return ID;
    }
    public void newDate() {
        dueDate = dueDate.plusYears(1);
        System.out.println("Das Ablaufdatum ist jetzt " + dueDate);
    }

    // Code --> Generate --> toString
    @Override
    public String toString() {
        return "Card{" +
                "dueDate=" + dueDate +
                ", ID='" + ID + '\'' +
                '}';
    }
}
