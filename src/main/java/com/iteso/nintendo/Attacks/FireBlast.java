package com.iteso.nintendo.Attacks;

public class FireBlast implements Atack {
    /**
     * Damage of Attack FireBlast.
     */
    private static final int DAMAGE = 10;
    /**
     * Name of the attack.
     */
    private static String name = "FireBlast";

    /**
     * Constructor.
     */
    public FireBlast() {

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
