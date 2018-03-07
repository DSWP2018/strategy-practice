package com.iteso.nintendo.implementations.attack;

import com.iteso.nintendo.Attack;

/**
 * Bubble.
 */
public class Bubble implements Attack {
    /**
     * Attack damage.
     */
    public static final int ATTACK_DAMAGE = 7;
    /**
     * Attack name.
     */
    public static final String ATTACK_NAME = "Bubble";

    /**
     *
     * @return How pokemon attacks
     */
    public final String attackOpponent() {
        return "Aventar burbujas";
    }

    /**
     *
     * @return pokemon animation
     */
    public final String animation() {
        return "Agitar manitas";
    }

    /**
     *
     * @return attack damage
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
