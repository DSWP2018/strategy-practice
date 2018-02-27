package com.iteso.nintendo;

public class Bubble implements Attack {
    public static final int ATTACK_DAMAGE = 7;
    public static final String ATTACK_NAME = "Bubble";

    @Override
    public String attackOpponent() {
        return "Aventar burbujas";
    }

    @Override
    public String animation() {
        return "Agitar manitas";
    }

    public int getAttackDamage(){
        return this.ATTACK_DAMAGE;
    }

    @Override
    public String getNameAttack() {
        return this.ATTACK_NAME;
    }
}
