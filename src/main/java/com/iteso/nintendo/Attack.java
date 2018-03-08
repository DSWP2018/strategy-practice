package com.iteso.nintendo;

/**
 * Interfaz del Ataque.
 */
public interface Attack {
    /**
     * @return regresa el ataque que se usa
     * y el daño que se causa
     */
    String attackOpponent();

    /**
     * @return regresa el nombre del ataque
     */
    String getAttackName();

    /**
     * @return regresa el tipo de daño
     */
    int getAttackDamage();

}
