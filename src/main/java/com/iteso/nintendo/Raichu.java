package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Raichu extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 180;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.7;

    /**
     * Pikachu constructor.
     */
    public Raichu() {
        setType(new Electric());
        setName("Raichu");
        setHasEvolution(false);
        setNewMainAttack(new Thunderbolt());
        setNewSecondAttack(new Tackle());
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

    @Override
    public final String evolve() {
        return null;
    }
}