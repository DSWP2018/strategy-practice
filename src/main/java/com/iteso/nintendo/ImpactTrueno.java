package com.iteso.nintendo;
/**
 * CREATED by FedericoIbarra.
 */

public class ImpactTrueno implements Attack {
    /**
     * Nombre del ataque.
     */

    private String attackName = "Impact Trueno";
    /**
     * Daño del ataque.
     */

    private final int attackDamage = 12;

    @Override
    public final String performAttack() {

        String messagge = new String("Attacking opponent with "
                + attackName
                + " causing a damage of " + attackDamage);

        return messagge;
    }
}
