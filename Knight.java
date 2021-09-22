package com.company;

public class Knight extends Character{

    public Knight() {
        super(new AxeBehaviour());
    }

    public void fight(){
        System.out.print("Knight is fighting ");
    }
}
