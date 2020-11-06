package model;

import java.util.List;
import java.util.UUID;

public class KeyCard extends Card {
    private final List<String> accessPoints;

    public KeyCard(Employee employee, List<String>accessPoints) {
        super("k" + UUID.randomUUID(), employee);
        this.accessPoints = accessPoints;
    }

    public List<String> getAccessPoints() {
        return accessPoints;
    }
}
