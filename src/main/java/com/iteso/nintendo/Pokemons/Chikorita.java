package com.iteso.nintendo.Pokemons;

import com.iteso.nintendo.Definitions.*;

public class Chikorita extends PokemonCharacter{
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 50;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.2;

    /**
     * Pikachu constructor.
     */
    public Chikorita(Attack mainAttack, Attack secondAttack) {
        setType("Grass");
        setName("Chikorita");
        setHasEvolution(true);
        setSecondAttack(secondAttack);
        setMainAttack(mainAttack);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

    @Override
    public final String evolve() {
        return null;
    }

    @Override
    public final String defend(Attack attack) {
        int damage;

        damage = (int) (attack.getAttackDamage() * getDefenseMultiplier());
        int newHP = getHitPoints() - damage;

        String defendMessage = new String("Defending attack, damage caused is "
                + damage + " new HP is " + newHP);

        setHitPoints(newHP);
        return defendMessage;

    }

    @Override
    public final String secondAttack() {
        return getSecondAttack().attackOpponent();
    }

    @Override
    public final String mainAttack() {
        return getMainAttack().attackOpponent();

    }
}
