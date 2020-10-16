import java.time.LocalDate;
import java.util.UUID;

public class CoffeeCard extends Card {
    private double credit;
    public CoffeeCard(String employee, LocalDate dueDate, double credit) {
        super(employee, dueDate, "c" + UUID.randomUUID());
        this.credit = credit;
    }
}
