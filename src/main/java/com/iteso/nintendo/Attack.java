package com.iteso.nintendo;

/**
 * Attack interface.
 */
public interface Attack {
    /**
     *
     * @return How pockemon attacks
     */
    String attackOpponent();

    /**
     *
     * @return pokemon animation
     */
    String animation();

    /**
     *
     * @return Attack damage
     */
    int getAttackDamage();

    /**
     *
     * @return The name of the attack
     */
    String getNameAttack();
}
