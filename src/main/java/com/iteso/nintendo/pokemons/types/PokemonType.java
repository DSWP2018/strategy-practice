package com.iteso.nintendo.pokemons.types;

/** */
public interface PokemonType {
    /**
     * @return String
     */
    String getTypeName();

    /**
     * @param pokemonType pokemonType
     * @return double
     */
    double attackMultiplier(PokemonType pokemonType);
}
