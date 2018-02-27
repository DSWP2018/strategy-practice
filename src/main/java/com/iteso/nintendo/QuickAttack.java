package com.iteso.nintendo;
/**
 * CREATED by FedericoIbarra.
 */

public class QuickAttack implements Attack {
    /**
     * Nombre del ataque.
     */

    private String attackName = "Quick Attack";
    /**
     * Daño del ataque.
     */

    private final int attackDamage = 15;

    @Override
    public final String performAttack() {

        String messagge = new String("Attacking opponent with "
                + attackName
                + " causing a damage of " + attackDamage);

        return messagge;
    }
}
