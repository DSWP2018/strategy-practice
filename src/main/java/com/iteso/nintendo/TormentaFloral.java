package com.iteso.nintendo;

/**
 * Tipo de ataque que implementa a la clase de Attack.
 */
public class TormentaFloral implements Attack {
    /**
     * Daño que causa el ataque.
     */
    private final int attackDamage = 23;

    @Override
    public final String getAttackName() {
        return "Tormenta Floral";
    }

    @Override
    public final int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public final String attackOpponent() {
        return "Ataque tormenta floral!";
    }

    @Override
    public final String cancelAttack() {
        return "Ataque cancelado";
    }
}
