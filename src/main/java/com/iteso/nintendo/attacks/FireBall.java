package com.iteso.nintendo.attacks;

public class FireBall implements Attack {

    private String attackName;
    private int damage;

    public FireBall(){
        attackName = "Fire ball";
        damage = 20;
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
