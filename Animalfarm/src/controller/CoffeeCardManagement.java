package controller;


import model.CoffeeCard;

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

    public static void main(String[] args) {

    }
}
