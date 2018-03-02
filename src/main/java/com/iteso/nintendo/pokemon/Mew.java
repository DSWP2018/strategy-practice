package com.iteso.nintendo.pokemon;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.impl.attacks.Acid;
import com.iteso.nintendo.impl.attacks.DiamondStorm;
import com.iteso.nintendo.types.Psychic;

/** Class Mew. /*
 *
 */
public class Mew extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 100;


    /**
     * Bulbasaur constructor.
     */
    public Mew() {
        setName("Mew");
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
