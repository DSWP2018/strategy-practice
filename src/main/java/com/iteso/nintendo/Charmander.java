package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Charmander extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 77;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.3;
    /**
     * Ataque principal.
     */
    private final Attack mainAttack = new BigFire();
    /**
     * Ataque principal.
     */
    private final Attack secondAttack = new SmallFire();

    /**
     * Pikachu constructor.
     */
    public Charmander() {
        setType("fire");
        setName("Charmander");
        setHasEvolution(true);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

    @Override
    public final String evolve() {
        return null;
    }

    @Override
    public final String defend(final int attack) {
        int damage;

        damage = (int) (attack * getDefenseMultiplier());
        int newHP = getHitPoints() - damage;

        String defendMessage = new String("Defending attack, damage caused is "
                + damage + " new HP is " + newHP);

        setHitPoints(newHP);
        return defendMessage;

    }

    @Override
    public final String secondAttack() {

        return secondAttack.performAttack();

    }

    @Override
    public final String mainAttack() {

        return mainAttack.performAttack();

    }




}
