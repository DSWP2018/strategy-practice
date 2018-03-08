package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.EnergyBall;
import com.iteso.nintendo.attacks.Thunder;
import com.iteso.nintendo.types.PokemonType;
import com.iteso.nintendo.types.PsychicType;

/**
 * Created by Diego Galindo.
 */
public class Mewtwo {

    /**
     * life points of the pokemon.
     */
    private static final int LIFEPOINTS = 200;

    /**
     * defense multiplier.
     */
    private static final double DEFENSE = 0.60;

    /**
     * Mewtwo type.
     */
    private PokemonType type;

    /**
     * Mewtwo main attack.
     */
    private Attack mainAttack;

    /**
     * Mewtwo second attack.
     */
    private Attack secondAttack;

    /**
     * check if Mewtwo evolve.
     */
    private boolean evolve;

    /**
     * Mewtwo constructor.
     */
    public Mewtwo() {
        type = new PsychicType();
        mainAttack = new EnergyBall();
        secondAttack = new Thunder();
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
