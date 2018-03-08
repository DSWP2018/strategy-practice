package com.iteso.nintendo;

/**
 * Interfaz de ataque.
 */
public interface Attack {

    /**
     * Efectuar ataque.
     * @return descripción del ataque.
     */
    String attackOpponent();

    /**
     * Devuelve tipo de ataque.
     * @return tipo.
     */
    String getAttackType();

    /**
     * devuelve nombre de ataque.
     * @return nombre.
     */
    String getAttackName();

    /**
     * devuelve daño de ataque.
     * @return daño.
     */
    int getAttackDamage();
        //Se le debe poner un atributo "tipo" a cada ataque

}
