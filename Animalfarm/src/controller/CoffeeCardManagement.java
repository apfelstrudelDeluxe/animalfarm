package controller;


import model.Address;
import model.CoffeeCard;
import model.Employee;
import model.Location;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class CoffeeCardManagement {

    private final List<CoffeeCard> coffeeCards;
    private final LocalDateTime current;
    public CoffeeCardManagement(){
        this.current = LocalDateTime.now();

        this.coffeeCards = new ArrayList<>();
        coffeeCards.add (new CoffeeCard(new Employee("Franz", "Huber", 758945, new Location(), "male", 1500, new Address(" ")), 2021-01-01, 20.80));
        coffeeCards.add( new CoffeeCard(new Employee("Helga", "Mair", 123456, new Location(), "male", 1500, new Address(" ")), 2020-01-01, 0.20));
        coffeeCards.add( new CoffeeCard(new Employee("Daniel", "Hofer", 654321, new Location(), "male", 1500, new Address(" ")), 2022-04-05, 4.50));

    }

    public static void main(String[] args) {

    }
}
