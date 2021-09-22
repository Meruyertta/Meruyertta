package com.company;

public class Main {

    public static void main(String[] args) {
        Character queen=new Queen();
        queen.fight();
        queen.fightWithWeapon();
       queen.setWeapon(new KatanaBehaviour());
       queen.fight();
       queen.fightWithWeapon();

    }
}
