package com.company;

public class Command {
    private DrinkType drinkType;
    private Sugar sugar;
    private Stick stick;

    public Command(DrinkType drinkType, Sugar sugar, Stick stick) {
        this.drinkType = drinkType;
        this.sugar = sugar;
        this.stick = stick;
    }

    public Command() {
    }

    public Stick getStick() {
        return stick;
    }

    public void setStick(Stick stick) {
        this.stick = stick;
    }

    public DrinkType getDrinkType() {

        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public Sugar getSugar() {
        return sugar;
    }

    public void setSugar(Sugar sugar) {
        this.sugar = sugar;
    }
}
