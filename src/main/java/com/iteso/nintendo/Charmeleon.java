package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Charmeleon extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 177;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.6;

    /**
     * Pikachu constructor.
     */
    public Charmeleon() {
        setType(new Fire());
        setName("Charmeleon");
        setHasEvolution(true);
        setNewMainAttack(new Ember());
        setNewSecondAttack(new Tackle());
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

    @Override
    public final String evolve() {
        return null;
    }
}
