/**
 * Package
 */
package com.iteso.nintendo.attack;

/**
 * Ataque.
 */
public interface Attack {


    /**
     * Get the attack.
     * @return attack to Opponent
     */
     String attackOpponent();

    /**
     * Get damage of main attack.
     * @return main attack damage.
     */
     int getAttackDamage();

    /**
     * Get name of the attack.
     * @return name attack
     */
     String getAttackName();
}
