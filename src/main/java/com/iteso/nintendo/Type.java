package com.iteso.nintendo;

/**
 * interfaz del tipo.
 */
public interface Type {

    /**
     * forma de cada pokemon de defenderse.
     * @param attack ataqque que recibe.
     * @return multiplicador de daño.
     */
    double defends(Attack attack);

}
