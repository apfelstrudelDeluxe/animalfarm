package model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class KeyCard extends Card {
    private final List<Location> accessPoints;

    public KeyCard() {
        super("k" + UUID.randomUUID());
        this.accessPoints = new ArrayList<>();
    }

    public List<Location> getAccessPoints() {
        return accessPoints;
    }

    // KeyCard hat als Datentyp "Location" zum Auswählen die angelegten Locations
    public boolean addAccessPoint(Location l) {
        return accessPoints.add(l);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + accessPoints;
    }



}












