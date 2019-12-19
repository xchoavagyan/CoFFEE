package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean displayMenu = true;
        while (displayMenu) {
            System.out.println("------COFFEE/TEA--MANIA------");
            System.out.println("PRESS WHAT YOU WANT TO DRINK");
            System.out.println("------------------------------");
            String[] s = scanner.nextLine().split(":");
            Converter converter = new Converter();
            CoffeeMachine coffeeMachine = new CoffeeMachine();
            try {
                coffeeMachine.makeDrink(converter.convertInputToCommand(s));
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("SOMETHING GO WRONG!!!!");
            }
        }
    }
}
