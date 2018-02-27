package com.iteso.nintendo;

public class Scratch implements Attack{

    public static final String attackName = "SCRATCH";
    public static final int attackDamage = 5;


    @Override
    public String attackOpponent() {
        return " ataca con " + this.attackName + " intentando hacer " + this.attackDamage + " de daño!";
    }
}
