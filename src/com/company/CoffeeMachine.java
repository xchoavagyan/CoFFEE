package com.company;

public class CoffeeMachine {

    public void makeDrink(Command command) {
        System.out.println("You want to drink : " + command.getDrinkType() + " with " + command.getSugar() + " spoon of sugar");
        System.out.println("Stick in cup : " + command.getStick());
    }

}
