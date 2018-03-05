package com.iteso.nintendo;

/**
 * Created by Federico Ibarra.
 * */

public interface PokemonType {

    /**
     * @return retorna el tipo de pokemon que es.
     */
    String getType();

    /**
     * @return el factor de defensa segun el tipo de pokemon que ataco.
     */
    int defenseFactor(PokemonType attackedType);

}
