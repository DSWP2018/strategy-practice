package com.iteso.nintendo;

public class ImpactTrueno implements Attack {
    public static final int ATTACK_DAMAGE = 15;
    public static final String ATTACK_NAME = "ImpactTrueno";

    @Override
    public String attackOpponent() {
        return "Aventar rayote";
    }

    @Override
    public String animation() {
        return "Externder dos manita";
    }

    public int getAttackDamage(){
        return this.ATTACK_DAMAGE;
    }

    @Override
    public String getNameAttack() {
        return this.ATTACK_NAME;
    }
}
