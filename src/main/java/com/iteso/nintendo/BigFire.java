package com.iteso.nintendo;

public class BigFire implements Attack {
    public static final int ATTACK_DAMAGE = 17;
    public static final String ATTACK_NAME = "BigFire";

    @Override
    public String attackOpponent() {
        return "Aventar bolota de fuego";
    }

    @Override
    public String animation() {
        return "Mover manitas rapido";
    }

    public int getAttackDamage(){
        return this.ATTACK_DAMAGE;
    }

    @Override
    public String getNameAttack() {
        return this.ATTACK_NAME;
    }
}
