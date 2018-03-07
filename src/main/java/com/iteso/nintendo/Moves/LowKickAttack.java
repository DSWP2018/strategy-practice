package com.iteso.nintendo.Moves;

import com.iteso.nintendo.Attack;

public class LowKickAttack implements Attack {
    private static final String ATTACK_NAME = "Low Kick";
    private  static final int ATTACK_DAMAGE= 15;
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
