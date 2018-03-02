package com.iteso.nintendo.pokemon;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.impl.attacks.Acid;
import com.iteso.nintendo.impl.attacks.DiamondStorm;
import com.iteso.nintendo.types.Psychic;

/** Class Eevee. /*
 *
 */
public class Eevee extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 104;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 1.1;

    /**
     * Bulbasaur constructor.
     */
    public Eevee() {
        setName("Eevee");
        setHasEvolution(true);
        setHitPoints(HIT_POINTS);
        PokemonType type = new Psychic();
        setType(type);
        Attack mainAttack = new Acid();
        setMainAttack(mainAttack);
        Attack secondAttack = new DiamondStorm();
        setSecondAttack(secondAttack);
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
}
