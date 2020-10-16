import java.time.LocalDate;

public class Card {
    private Employee employee;
    private LocalDate dueDate;
    private final String ID;

    public Card(Employee employee, LocalDate dueDate, String ID) {
        this.employee = employee;
        this.dueDate = dueDate;
        this.ID = ID;
    }
}
