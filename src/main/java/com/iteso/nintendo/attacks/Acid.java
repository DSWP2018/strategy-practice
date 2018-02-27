package com.iteso.nintendo.attacks;

public class Acid implements Attack {

    private String attackName;
    private int damage;

    public Acid(){
        attackName = "Acid";
        damage = 5;
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
