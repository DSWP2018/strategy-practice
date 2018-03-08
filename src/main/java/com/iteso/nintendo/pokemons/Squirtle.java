package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.Bite;
import com.iteso.nintendo.attacks.Water;
import com.iteso.nintendo.types.PokemonType;
import com.iteso.nintendo.types.WaterType;

/**
 * Created by Diego Galindo.
 */
public class Squirtle {

    /**
     * life points of the pokemon.
     */
    private static final int LIFEPOINTS = 200;

    /**
     * defense multiplier.
     */
    private static final double DEFENSE = 0.20;

    /**
     * Squirtle type.
     */
    private PokemonType type;

    /**
     * Squirtle main attack.
     */
    private Attack mainAttack;

    /**
     * Squirtle second attack.
     */
    private Attack secondAttack;

    /**
     * check if Squirtle evolve.
     */
    private boolean evolve;

    /**
     * Squirtle constructor.
     */
    public Squirtle() {
        type = new WaterType();
        mainAttack = new Water();
        secondAttack = new Bite();
        evolve = true;
    }

    /**
     * Attack method of the pokemon.
     * @return the main attack name
     */
    public final String attackWithMain() {
        return mainAttack.attack();
    }

    /**
     * Attack method of the pokemon.
     * @return the second attack name
     */
    public final String attackWithSecond() {
        return secondAttack.attack();
    }

    /**
     * Pokemon type.
     * @return the type name of the pokemon
     */
    public final String type() {
        return type.pokemonType();
    }

    /**
     * Pokemon weakness type.
     * @return the weakness type name of the pokemon
     */
    public final String weakness() {
        return type.pokemonWeakness();
    }
}
