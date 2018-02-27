package com.iteso.nintendo.Pokemons;

import com.iteso.nintendo.Definitions.Attack;
import com.iteso.nintendo.Definitions.PokemonCharacter;

/**
 * Clase que extiende PokemonCharacter.
 */
public class Cyndaquill extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 60;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.6;

    /**
     * Cyndaquill constructor.
     * @param mainAttack ataque principal.
     * @param secondAttack ataque secundario.
     */
    public Cyndaquill(final Attack mainAttack, final Attack secondAttack) {
        setType("Fire");
        setName("Cyndaquill");
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
    public final String defend(final Attack attack) {
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
