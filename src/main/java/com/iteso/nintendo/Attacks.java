package com.iteso.nintendo;

/**
 * Interfaz con metodos de ataque.
 * @since 02-26-2018
 * */
public interface Attacks {
    /**
     *metodo del nombre del ataque.
     *@return String
     * */
    String attackName();
    /**
     *metodo del nombre danio del ataque.
     *@return int
     * */
    int attackDamage();
    /**
     *metodo del ataque.
     *@return void
     * */
    String attackOpponent();
    /**
     *metodo del ataque.
     *@return void
     * */
    String attackType();


}
