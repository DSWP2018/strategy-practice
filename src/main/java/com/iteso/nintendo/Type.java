package com.iteso.nintendo;

public interface Type {
    /**
     * @return regresa el tipo de Pokemon
     */
    String getType();

    /**
     * @return regresa el nivel de damage
     */
    double getDamageMultiplier();

    /**
     * @return regresa el nivel de defensa
     */
    double getDefenseMultiplier();
}
