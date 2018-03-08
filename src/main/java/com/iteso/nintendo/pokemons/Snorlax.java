package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.Bite;
import com.iteso.nintendo.attacks.Sleep;
import com.iteso.nintendo.types.NormalType;
import com.iteso.nintendo.types.PokemonType;

/**
 * Created by Diego Galindo.
 */
public class Snorlax {

    /**
     * life points of the pokemon.
     */
    private static final int LIFEPOINTS = 200;

    /**
     * defense multiplier.
     */
    private static final double DEFENSE = 0.40;

    /**
     * Snorlax type.
     */
    private PokemonType type;

    /**
     * Snorlax main attack.
     */
    private Attack mainAttack;

    /**
     * Snorlax second attack.
     */
    private Attack secondAttack;

    /**
     * check if Snorlax evolve.
     */
    private boolean evolve;

    /**
     * Snorlax constructor.
     */
    public Snorlax() {
        type = new NormalType();
        mainAttack = new Sleep();
        secondAttack = new Bite();
        evolve = false;
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
