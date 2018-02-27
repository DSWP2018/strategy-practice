package com.iteso.nintendo;

public class QuickAttack implements Attack {
    public static final int ATTACK_DAMAGE = 5;
    public static final String ATTACK_NAME = "QuickAttack";

    @Override
    public String attackOpponent() {
        return "Aventar rayito";
    }

    @Override
    public String animation() {
        return "Extender manita";
    }

    public int getAttackDamage(){
        return this.ATTACK_DAMAGE;
    }

    @Override
    public String getNameAttack() {
        return this.ATTACK_NAME;
    }
}
