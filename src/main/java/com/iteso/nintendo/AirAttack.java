package com.iteso.nintendo;
/**
 * Ataque de aire.
 */
public class AirAttack implements Attack {
    /**
     * Declaracion de nombre.
     */
    private static final String ATTACK_NAME = "Air Attack";
    /**
     * Declaracion de daño.
     */
    private static final int ATTACK_DAMAGE = 10;

    @Override
    public final String attackOpponent() {
        return "Attacking opponent with "
                + this.ATTACK_NAME
                + " causing a damage of "
                + this.ATTACK_DAMAGE;
    }

    @Override
    public final String getAttackName() {
        return this.ATTACK_NAME;
    }

    @Override
    public final int getAttackDamage() {
        return this.ATTACK_DAMAGE;
    }
}
