package com.iteso.nintendo.attack;


/**
 * Attack QuickAttack.
 */
public class QuickAttack implements Attack {
    /**
     * Damage of Quick Attack.
     */
    private static final int DAMAGE = 5;
    /**
     * Name of Attack.
     */
    private static String name = "QuickAttack";

    /**
     * Constructor.
     */
    public QuickAttack() {

    }

    @Override
    public final String attackOpponent() {
        String attackMessage = new String("Attacking opponent with "
                + name
                + " causing a damage of " + DAMAGE);
        return attackMessage;
    }

    @Override
    public final int getAttackDamage() {
        return DAMAGE;
    }

    @Override
    public final String getAttackName() {
        return name;
    }
}
