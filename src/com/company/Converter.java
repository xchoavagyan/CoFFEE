package com.company;

public class Converter {
    public Command convertInputToCommand(String s[]) {
        Command command = new Command();
        if (s[0].toUpperCase().equals("T")) {
            command.setDrinkType(DrinkType.TEA);
        } else if (s[0].toUpperCase().equals("C")) {
            command.setDrinkType(DrinkType.COFFEE);
        } else {
            System.out.println("Please Enter coffee or tea C , T ");
        }
        if (s[1].equals("0")) {
            command.setSugar(Sugar.NONE);
        } else if (s[1].equals("1")) {
            command.setSugar(Sugar.ONE);
        } else if (s[1].equals("2")) {
            command.setSugar(Sugar.TWO);
        } else {
            System.out.println("Please Enter sugar quantity in range 0 - 2");
        }

        if (s[2].equals("1")) {
            command.setStick(Stick.EXIST);
        } else if (s[2].equals("0") && s[1].equals("1") || s[2].equals("0") && s[1].equals("2")) {
            command.setStick(Stick.EXIST);
        } else if (s[2].equals("0")) {
            command.setStick(Stick.NOT_EXIST);
        } else {
            System.out.println("Enter will you want a stick 0 or 1");
        }

        return command;
    }
}
