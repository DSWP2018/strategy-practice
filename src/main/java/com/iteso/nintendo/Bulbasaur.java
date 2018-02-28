package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Bulbasaur extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 71;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.5;

    /**
     * Pikachu constructor.
     */
    public Bulbasaur() {
        setType(new Grass());
        setName("Bulbasaur");
        setHasEvolution(true);
        setNewMainAttack(new VineWhip());
        setNewSecondAttack(new Tackle());
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

    @Override
    public final String evolve() {
        return null;
    }
}
