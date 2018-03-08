package com.iteso.nintendo.pokemons.types;

import com.iteso.nintendo.pokemons.PokemonCharacter;

/** */
public abstract class FlyingTypePokemon extends PokemonCharacter {
    /** */
    private String type = "Water";

    /**
     * @param pokemonType pokemonType
     * @return double
     */
    public final double attackMultiplier(final PokemonType pokemonType) {
        return 0;
    }

    /**
     * @return String
     */
    public final String getTypeName() {
        return this.type;
    }
}
