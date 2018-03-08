package com.iteso.nintendo.Attacks;

public interface Atack {


    /**
     * Get the attack
     * @return
     */
    String attackOpponent();

    /**
     * Get damage of main attack.
     * @return main attack damage.
     */
    int getAttackDamage();

    /**
     * Get name of the attack
     * @return
     */
    String getAttackName();
}
