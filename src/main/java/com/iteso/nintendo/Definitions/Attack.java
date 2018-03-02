package com.iteso.nintendo.Definitions;

/**
 * Interfaz de Ataque que nos sirve para especficar el comportamiento
 * de los objetos que serán Ataques de los pokemones.
 */
public interface Attack {
    /**
     * Método que recibe un pokemon y calcula el daño hecho por el ataque.
     * Toma en cuenta el defense multiplier del pokemon objetivo.
     * @return mensaje de ataque.
     * @param myType tipo del pokemon que hará el ataque.
     * @param pokemonCharacter pokemon que recibe el ataque.
     */
    String attackOpponent(PokemonType myType,
                          PokemonCharacter pokemonCharacter);

    /**
     * Método que regresa el nombre del ataque utilizado.
     * @return nombre del ataque.
     */
    String getAttackName();

    /**
     * Metodo que regresa el daño del ataque utilizado.
     * @return daño del ataque.
     */
    int getAttackDamage();

}
