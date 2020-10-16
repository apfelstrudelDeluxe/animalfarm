import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class KeyCard extends Card {
    List<String> accessPoints;
    public KeyCard(String employee, LocalDate dueDate, List<String>accessPoints) {
        super(employee, dueDate, "k" + UUID.randomUUID());
        this.accessPoints = accessPoints;
    }
}
