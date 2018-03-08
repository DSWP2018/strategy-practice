package com.iteso.nintendo;

/**
 *
 */
public interface PokemonAttack {
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
