package com.iteso.nintendo.attacks;

import com.iteso.nintendo.attacks.Attack;

public class Thunder implements Attack {

    private String attackName;
    private int damage;

    public Thunder(){
        attackName = "Thunder";
        damage = 15;
    }

    @Override
    public String attack() {
        return "Se ataco al pokemon con " + attackName + ", dañandolo con " + damage + " puntos.";
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
