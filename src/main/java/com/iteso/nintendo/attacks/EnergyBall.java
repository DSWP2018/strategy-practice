package com.iteso.nintendo.attacks;

public class EnergyBall implements Attack {

    private String attackName;
    private int damage;

    public EnergyBall(){
        attackName = "Energy ball";
        damage = 25;
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
