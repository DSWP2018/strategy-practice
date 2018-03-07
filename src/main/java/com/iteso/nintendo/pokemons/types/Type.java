package com.iteso.nintendo.pokemons.types;

import com.iteso.nintendo.pokemons.PokemonCharacter;
/**
 * Jajajaja.
 */
public interface Type {
    /**
     * Calculates the effectiveness depending on the p. type
     * @param attacked the pokemon being attacked
     * @return the multiplier (0~1) of the damage*/
    double getAttackMultiplier(PokemonCharacter attacked);
}
