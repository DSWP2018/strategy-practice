package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.Bite;
import com.iteso.nintendo.attacks.FireBall;
import com.iteso.nintendo.types.FireType;
import com.iteso.nintendo.types.PokemonType;


/**
 * Created by Diego Galindo.
 */
public class Charizard {

    /**
     * life points of the pokemon.
     */
    private static final int LIFEPOINTS = 200;

    /**
     * defense multiplier.
     */
    private static final double DEFENSE = 0.20;

    /**
     * Charizard type.
     */
    private PokemonType type;

    /**
     * Charizard main attack.
     */
    private Attack mainAttack;

    /**
     * Charizard second attack.
     */
    private Attack secondAttack;

    /**
     * check if Charizard evolve.
     */
    private boolean evolve;

    /**
     * Charizard constructor.
     */
    public Charizard() {
        type = new FireType();
        mainAttack = new FireBall();
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
