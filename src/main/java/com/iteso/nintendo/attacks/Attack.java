package com.iteso.nintendo.attacks;

/**
 * Created by Diego Galindo.
 */
public interface Attack {
    /**
     * Attack action.
     * @return the action of the attack
     */
    String attack();

    /**
     * Attack name.
     * @return the name of the attack
     */
    String attackName();

    /**
     * Attack damage of the attack.
     * @return the damage of the attack
     */
    int attackDamage();
}
