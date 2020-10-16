import java.time.LocalDate;

public class Card {

    private String employee;
    private LocalDate dueDate;
    private String ID;

    public Card(String employee, LocalDate dueDate, String ID) {
        this.employee = employee;
        this.dueDate = dueDate;
        this.ID = ID;
    }
}
