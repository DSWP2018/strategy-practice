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
     * @param attackedType el tipo del pokemon que ataco al tipo Water.
     * @return numero entre 1-10entre mas alto mas resistente es atque externo
     */

    int defenseFactor(PokemonType attackedType);

}
