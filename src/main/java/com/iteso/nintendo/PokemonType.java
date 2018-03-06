package com.iteso.nintendo;

public interface PokemonType {
    /**
     *metodo del nombre del ataque.
     *@return String
     * */
    String attackType();
    /**
     *metodo del nombre danio del ataque.
     *@return int
     * */
    double recievedDamage(String ataqueTipo, double defenseMultiplier);
    /**
     *metodo del ataque.
     *@return void
     * */
    String defendMessage();
}
