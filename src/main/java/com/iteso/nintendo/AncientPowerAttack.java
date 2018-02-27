package com.iteso.nintendo;

public class AncientPowerAttack implements Attack {
    private static final String ATTACK_NAME = "Ancient Power";
    private  static final int ATTACK_DAMAGE= 17;
    private static final String DEFENSE_NAME = "protect";
    private static final int DEFENSE_POINTS = 100;
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
