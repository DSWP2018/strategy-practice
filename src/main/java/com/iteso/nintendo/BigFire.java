package com.iteso.nintendo;

/**
 * Created by FedericoIbarra.
 * */

public class BigFire implements Attack {

    /**
     * Nombre del ataque.
     */
    private String attackName = "Big Fire";

    /**
     * Daño del ataque.
     */
    private final int attackDamage = 17;

    @Override
    public final String performAttack() {

        String messagge = new String("Attacking opponent with "
                + attackName
                + " causing a damage of " + attackDamage);

        return messagge;
    }
}
