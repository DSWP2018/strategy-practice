package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Wartortle extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 182;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 1.2;

    /**
     * Pikachu constructor.
     */
    public Wartortle() {
        setType(new Water());
        setName("Wartortle");
        setHasEvolution(true);
        setNewMainAttack(new WaterGun());
        setNewSecondAttack(new Tackle());
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

    @Override
    public final String evolve() {
        return null;
    }
}