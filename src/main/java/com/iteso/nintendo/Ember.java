package com.iteso.nintendo;

public class Ember implements Attack{

    public static final String attackName = "EMBER";
    public static final int attackDamage = 8;


    @Override
    public String attackOpponent() {
        return " ataca con " + this.attackName + " intentando hacer " + this.attackDamage + " de daño!";
    }
}
