package com.iteso.nintendo;

import com.iteso.nintendo.attacks.Attack;

public class Mordida implements Attack {

    private String attackName = "Mordida!";
    private int damage = 50;


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
