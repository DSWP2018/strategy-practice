package com.iteso.nintendo;

public class Sparks implements Attack{

    public static final String attackName = "SPARKS";
    public static final int attackDamage = 9;


    @Override
    public String attackOpponent() {
        return " ataca con " + this.attackName + " intentando hacer " + this.attackDamage + " de daño!";
    }
}
