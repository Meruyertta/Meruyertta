package com.company;

public class Queen extends Character {
    public Queen() {
        super(new BowAndArrowBehaviour());
    }

    public void fight() {
        System.out.print("Queen is fighting! ");

    }

}
