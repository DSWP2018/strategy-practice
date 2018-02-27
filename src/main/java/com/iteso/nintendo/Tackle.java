package com.iteso.nintendo;

public class Tackle implements Attack{

    public static final String attackName = "TACKLE";
    public static final int attackDamage = 6;


    @Override
    public String attackOpponent() {
        return " ataca con " + this.attackName + " intentando hacer " + this.attackDamage + " de daño!";
    }
}
