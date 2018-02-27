package com.iteso.nintendo;

public class SwallowAttack implements Attack {

    /**
     *
     */
    public static final String ATTACK_NAME = "Swallow";

    /**
     *
     */
    public static final int ATTACK_DAMAGE = 10;
    /**
     *
     * @return string of the attack
     */
    @Override
    public String attackOpponent() {
        return "Attacking opponent with "
                + ATTACK_NAME
                + " causing a damage of " + ATTACK_DAMAGE;
    }

    @Override
    public String getAttackName() {
        return this.ATTACK_NAME;
    }

    @Override
    public int getAttackDamage() {
        return this.ATTACK_DAMAGE;
    }
}
