package com.iteso.nintendo.attack;

/**
 * Attack Small Fire.
 */
public class SmallFire implements Attack {
    /**
     * Attack Damage of SmallFire.
     */
    private static final int DAMAGE = 3;
    /**
     * Name of Attack.
     */
    private static String name = "SmallFire";

    /**
     * Constructor.
     */
    public SmallFire() {

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
