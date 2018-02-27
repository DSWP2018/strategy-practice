package com.iteso.nintendo.attacks;

public class Bite implements Attack {

    private String attackName;
    private int damage;

    public Bite(){
        attackName = "Bite";
        damage = 9;
    }

    @Override
    public String attack() {
        return "Pokemon used " + attackName + ", making a damage of " + damage + ".";
    }

    @Override
    public String attackName() {
        return attackName;
    }

    @Override
    public int attackDamage() {
        return damage;
    }
}
