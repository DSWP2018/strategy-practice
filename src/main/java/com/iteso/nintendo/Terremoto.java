package com.iteso.nintendo;

/**
 * Tipo de ataque que implementa a la clase de Attack.
 */
public class Terremoto implements Attack {
    /**
     * Daño que causa el ataque.
     */
    private final int attackDamage = 21;

    @Override
    public final String getAttackName() {
        return "Terremoto";
    }

    @Override
    public final int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public final String attackOpponent() {
        return "Ataque terremoto!";
    }

    @Override
    public final String cancelAttack() {
        return "Ataque cancelado";
    }
}
