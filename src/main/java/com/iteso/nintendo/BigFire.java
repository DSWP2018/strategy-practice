package com.iteso.nintendo;

/**
 * BigFire Attack.
 */
public class BigFire implements Attack {
    /**
     * Damage.
     */
    private static final int attackDamage = 17;

    /**
     * Name Attack.
     */
    private static String name = "BigFire";

    /**
     * Constructor.
     */
    public BigFire(){

    }

    @Override
    public String attackOpponent() {
        String attackMessage = new String("Attacking opponent with "
                + name
                + " causing a damage of " + attackDamage);
        return attackMessage;
    }

    @Override
    public int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public String getAttackName() {
        return name;
    }
}
