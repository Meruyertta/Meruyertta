package com.company;

public abstract class Character {
    //Program to an interface, not an implementation
    //Favor composition over inheritance
    //Character has a weaponBehaviour
    private WeaponBehaviour weapon;

    public Character(WeaponBehaviour weapon) {
        this.weapon=weapon;
    }

    public void setWeapon(WeaponBehaviour weapon) {
        this.weapon = weapon;
    }

    public abstract void fight();

    public void fightWithWeapon (){
        weapon.useWeapon();
    }

}
