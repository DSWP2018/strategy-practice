package com.iteso.nintendo;

/**
 * Ataque.
 */
public interface Attack {


    /**
     * Get the attack.
     * @return
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
