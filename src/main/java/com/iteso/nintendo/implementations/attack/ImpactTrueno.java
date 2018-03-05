package com.iteso.nintendo.implementations.attack;

import com.iteso.nintendo.Attack;

/**
 * Impact trueno.
 */
public class ImpactTrueno implements Attack {
    /**
     * Attack damage.
     */
    public static final int ATTACK_DAMAGE = 15;
    /**
     * Attack name.
     */
    public static final String ATTACK_NAME = "ImpactTrueno";

    /**
     *
     * @return Attack
     */
    @Override
    public final String attackOpponent() {
        return "Aventar rayote";
    }

    /**
     *
     * @return Animation
     */
    @Override
    public final String animation() {
        return "Externder dos manita";
    }

    /**
     *
     * @return Attack damage
     */
    public final int getAttackDamage() {
        return this.ATTACK_DAMAGE;
    }

    /**
     *
     * @return Attack name
     */
    @Override
    public final String getNameAttack() {
        return this.ATTACK_NAME;
    }
}
