package com.iteso.nintendo.attacks;

public class Sleep implements Attack {

    private String attackName;
    private int damage;

    public Sleep(){
        attackName = "Sleep";
        damage = 0;
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
