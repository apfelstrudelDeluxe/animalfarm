package model;

import java.time.LocalDate;

public class Card {
    private final Employee employee;
    private LocalDate dueDate;
    private final String ID;

    public Card(String ID, Employee employee) {
        dueDate = LocalDate.now();
        // expire in one year
        dueDate = dueDate.plusYears(1);
        this.ID = ID;
        this.employee = employee;
    }

    public boolean isValid(LocalDate cardTime) {
        return cardTime.isBefore(dueDate);
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getID() {
        return ID;
    }
    public void newDate() {
        dueDate = dueDate.plusYears(1);
        System.out.println("Das Ablaufdatum ist jetzt " + dueDate);
    }


}
