package com.iteso.nintendo;

/**
 * Tipo de ataque que implementa a la clase de Attack.
 */
public class Avalancha implements Attack {
    /**
     * Daño que causa el ataque.
     */
    private final int attackDamage = 17;

    @Override
    public final String getAttackName() {
        return "Avalancha";
    }

    @Override
    public final int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public final String attackOpponent() {
        return "Ataque avalancha!";
    }

    @Override
    public final String cancelAttack() {
        return "Ataque cancelado";
    }
}
