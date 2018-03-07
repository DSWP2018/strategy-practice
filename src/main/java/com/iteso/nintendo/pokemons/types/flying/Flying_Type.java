package com.iteso.nintendo.pokemons.types.flying;

import com.iteso.nintendo.pokemons.PokemonCharacter;
import com.iteso.nintendo.pokemons.types.Type;
import com.iteso.nintendo.pokemons.types.electric.Electric_Type;
import com.iteso.nintendo.pokemons.types.fighting.Fighting_Type;
import com.iteso.nintendo.pokemons.types.fire.Fire_Type;
import com.iteso.nintendo.pokemons.types.grass.Grass_Type;
import com.iteso.nintendo.pokemons.types.poison.Poison_Type;
import com.iteso.nintendo.pokemons.types.water.Water_Type;
/**
 * Set.
 */
public class Flying_Type implements Type {
    @Override
    public final double getAttackMultiplier(final PokemonCharacter attacked) {
        if (attacked.getType() instanceof Electric_Type) {
            return 0.5;
        } else if (attacked.getType() instanceof Fighting_Type) {
            return 2;
        } else if (attacked.getType() instanceof Fire_Type) {
            return 1;
        } else if (attacked.getType() instanceof Flying_Type) {
            return 1;
        } else if (attacked.getType() instanceof Grass_Type) {
            return 2;
        } else if (attacked.getType() instanceof Poison_Type) {
            return 1;
        } else if (attacked.getType() instanceof Water_Type) {
            return 1;
        } else {
            return 0;
        }
    }
}
