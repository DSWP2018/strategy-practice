package com.iteso.nintendo.implementations.attack;

import com.iteso.nintendo.Attack;

/**
 * Quick attack.
 */
public class QuickAttack implements Attack {
    /**
     * Attack damage.
     */
    public static final int ATTACK_DAMAGE = 5;
    /**
     * Attack name.
     */
    public static final String ATTACK_NAME = "QuickAttack";

    /**
     *
     * @return Attack
     */
    public final String attackOpponent() {
        return "Aventar rayito";
    }

    /**
     *
     * @return animation
     */
    public final String animation() {
        return "Extender manita";
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
     * @return Name attack
     */
    public final String getNameAttack() {
        return this.ATTACK_NAME;
    }
}
