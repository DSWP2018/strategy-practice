package com.iteso.nintendo;

public interface Attack {


    /**
     * Get the attack
     * @return
     */
    public String attackOpponent();

    /**
     * Get damage of main attack.
     * @return main attack damage.
     */
    public int getAttackDamage();

    /**
     * Get name of the attack
     * @return
     */
    public String getAttackName();
}
