package com.iteso.nintendo;

/**
 *solar beam.
 */
public class SolarBeamAttack implements Attack {
    /**
     *
     */
    public static final String ATTACK_NAME = "Solar Beam";

    /**
     *
     */
    public static final int ATTACK_DAMAGE = 100;
    /**
     *
     * @return string of the attack
     */
    @Override
    public final String attackOpponent() {
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
