package controller;


import model.Address;
import model.CoffeeCard;
import model.Employee;
import model.Location;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class CoffeeCardManagement {

    private final List<CoffeeCard> coffeeCards;
    private final LocalDateTime current;
    public CoffeeCardManagement(){
        this.current = LocalDateTime.now();
        this.coffeeCards = new ArrayList<>();
    }
}
