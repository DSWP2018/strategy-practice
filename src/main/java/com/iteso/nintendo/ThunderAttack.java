package com.iteso.nintendo;

/**
 *
 */
public class ThunderAttack implements Attack{
    /**
     *
     */
    public static final String ATTACK_NAME = "Thunder";

    /**
     *
     */
    public static final int ATTACK_DAMAGE = 70;
    /**
     *
     * @return string of the attack
     */
    @Override
    public String attackOpponent() {
        return "Attacking opponent with "
                + ATTACK_NAME
                + " causing a damage of " + ATTACK_DAMAGE;
    }

    @Override
    public final String getAttackName() {
        return this.ATTACK_NAME;
    }

    @Override
    public final int getAttackDamage() {
        return this.ATTACK_DAMAGE;
    }
}