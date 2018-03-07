package com.iteso.nintendo.Moves;

import com.iteso.nintendo.Attack;

public class IceBeamAttack implements Attack {
    private static final String ATTACK_NAME = "Ice Beam";
    private  static final int ATTACK_DAMAGE= 23;
    private static final String TYPE = "Ice"; /**Tipo de ataque. */
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
