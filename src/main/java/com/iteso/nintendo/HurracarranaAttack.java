package com.iteso.nintendo;

/**
 * CREATED by FedericoIbarra.
 */

public class HurracarranaAttack implements Attack {
    /**
     * Nombre del ataque.
     */

    private String attackName = "Hurracarrana";
    /**
     * Daño del ataque.
     */

    private final int attackDamage = 23;

    @Override
    public final String performAttack() {

        String messagge = new String("Attacking opponent with "
                + attackName
                + " causing a damage of " + attackDamage);

        return messagge;
    }
}
