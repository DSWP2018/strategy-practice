package com.iteso.nintendo.Moves;

import com.iteso.nintendo.Attack;

public class FireBlazeAttack implements Attack {
    private static final String ATTACK_NAME = "fire blaze";
    private  static final int ATTACK_DAMAGE= 20;
    private static final String TYPE = "fire"; /**Tipo de ataque. */
    @Override
    public String attackOpponent() {
        return "Attacking opponent with " + ATTACK_NAME + " causing a damage of " + ATTACK_DAMAGE;
    }

    @Override
    public String defenseTurn() {
        return null;
    }

    @Override
    public String getAttackName() {
        return this.ATTACK_NAME;
    }

    @Override
    public int getAttackDamage() {
        return this.ATTACK_DAMAGE;
    }
}
