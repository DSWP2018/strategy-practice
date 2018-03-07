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
    public final String attackOpponent() {
        return "Aventar rayote";
    }

    /**
     *
     * @return Animation
     */
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
    public final String getNameAttack() {
        return this.ATTACK_NAME;
    }
}
