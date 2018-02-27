package com.iteso.nintendo;
/**
 * CREATED by FedericoIbarra.
 */

public class SmallFire implements Attack {
    /**
     * Nombre del ataque.
     */

    private String attackName = "Small Fire";
    /**
     * Daño del ataque.
     */

    private final int attackDamage = 3;

    @Override
    public final String performAttack() {

        String messagge = new String("Attacking opponent with "
                + attackName
                + " causing a damage of " + attackDamage);

        return messagge;
    }
}
