package com.iteso.nintendo.tipos;
/**
 * */
public interface PokemonType {
    /**
     *metodo del nombre del ataque.
     *@return String
     * */
    String type();
    /**
     *metodo del nombre danio del ataque.
     * @param  ataqueTipo tipo de ataque
     * @param defenseMultiplier defensa
     * @return  danio recivido
     * */
    double recievedDamage(String ataqueTipo, double defenseMultiplier);
    /**
     *metodo del nombre danio del ataque.
     *@return String
     * */
    String defendMessage();
}
