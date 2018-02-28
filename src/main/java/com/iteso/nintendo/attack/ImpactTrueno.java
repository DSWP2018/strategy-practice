package com.iteso.nintendo.attack;


/**
 * Attack ImpactTrueno.
 */
public class ImpactTrueno implements Attack {
    /**
     * Attack Damege of ImpactTrueno.
     */
    private static final int DAMAGE = 15;
    /**
     * Name of this Attack (Imapact Trueno).
     */
    private static String name = "ImpactTrueno";

    /**
     * Constructor.
     */
    public ImpactTrueno() {

    }

    @Override
    public final String attackOpponent() {
        String attackMessage = new String("Attacking opponent with "
                + name
                + " causing a DAMAGE of " + DAMAGE);
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
