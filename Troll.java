package com.company;

public class Troll  extends Character {
    public Troll() {
        super(new KnifeBehaviour());
    }

    public void fight(){
        System.out.println("Troll is fighting");
    }


}
