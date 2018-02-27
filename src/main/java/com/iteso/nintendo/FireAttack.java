package com.iteso.nintendo;

public class FireAttack implements Attack{
    private static final String ATTACK_NAME = "Fire Attack";
    private static final int ATTACK_DAMAGE = 25;

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
