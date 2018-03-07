package com.iteso.nintendo.attacks;

public class Water implements Attack {

    private String attackName;
    private int damage;

    public Water(){
        attackName = "Water";
        damage = 12;
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