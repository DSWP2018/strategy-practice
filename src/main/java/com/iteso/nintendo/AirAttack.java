package com.iteso.nintendo;

public class AirAttack implements Attack{
    private static final String ATTACK_NAME = "Air Attack";
    private static final int ATTACK_DAMAGE = 10;

    @Override
    public String attackOpponent() {
        return "Attacking opponent with " +
                this.ATTACK_NAME +
                " causing a damage of " +
                this.ATTACK_DAMAGE;
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
