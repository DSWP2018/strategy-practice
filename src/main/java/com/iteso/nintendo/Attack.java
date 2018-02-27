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
     * @return Pokemon animation
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
