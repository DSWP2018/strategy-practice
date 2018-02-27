package com.iteso.nintendo;

/**
 *
 */
public class FrezeeShockAttack implements Attack {
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
    public final String  attackOpponent() {
        return "Attacking opponent with "
                + ATTACK_NAME
                + " causing a damage of " + ATTACK_DAMAGE;
    }

    /**
     *
     * @return attack name
     */
    public final String getAttackName() {
        return this.ATTACK_NAME;
    }

    /**
     *
     * @return damage
     */
    public final int getAttackDamage() {
        return this.ATTACK_DAMAGE;
    }
}
