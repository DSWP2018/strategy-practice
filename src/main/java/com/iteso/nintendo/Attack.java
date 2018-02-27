package com.iteso.nintendo;

/**
 *
 */
public interface Attack {
    /**
     *
     * @return the string of the attack
     */
    String attackOpponent();

    /**
     *
     * @return attack name
     */
    String getAttackName();

    /**
     *
     * @return attack damage
     */
    int getAttackDamage();
}
