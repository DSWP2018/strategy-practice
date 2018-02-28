package com.iteso.nintendo.attack;

/**
 * BigFire attack.
 */
public class BigFire implements Attack {
    /**
     * Damage.
     */
    private static final int DAMAGE = 17;

    /**
     * Name attack.
     */
    private static String name = "BigFire";

    /**
     * Constructor.
     */
    public BigFire() {

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
