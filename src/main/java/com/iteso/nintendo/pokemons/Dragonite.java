package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.EnergyBall;
import com.iteso.nintendo.attacks.Thunder;
import com.iteso.nintendo.types.PokemonType;
import com.iteso.nintendo.types.ThunderType;

/**
 * Created by Diego Galindo.
 */
public class Dragonite {

    /**
     * life points of the pokemon.
     */
    private static final int LIFEPOINTS = 200;

    /**
     * defense multiplier.
     */
    private static final double DEFENSE = 0.40;

    /**
     * Dragonite type.
     */
    private PokemonType type;

    /**
     * Dragonite main attack.
     */
    private Attack mainAttack;

    /**
     * Dragonite second attack.
     */
    private Attack secondAttack;

    /**
     * check if Dragonite evolve.
     */
    private boolean evolve;

    /**
     * Dragonite constructor.
     */
    public Dragonite() {
        type = new ThunderType();
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
