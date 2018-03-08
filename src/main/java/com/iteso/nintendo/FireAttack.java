package com.iteso.nintendo;

/**
 * Tipo de Ataque.
 */
public class FireAttack implements Attack {
    /**
     * Declaración de nombre.
     */
    private static final String ATTACK_NAME = "Fire Attack";
    /**
     * Declaración del daño.
     */
    private static final int ATTACK_DAMAGE = 25;

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
