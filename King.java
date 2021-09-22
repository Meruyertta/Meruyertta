package com.company;

public class King extends Character {
    public King() {
        super(new SwordBehaviour());
    }

    public void fight(){
        System.out.println("King is fighting");
    }

}
