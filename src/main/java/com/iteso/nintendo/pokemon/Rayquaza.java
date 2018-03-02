package com.iteso.nintendo.pokemon;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.impl.attacks.ElectroBall;
import com.iteso.nintendo.impl.attacks.Thunder;
import com.iteso.nintendo.types.Normal;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Rayquaza extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 284;


    /**
     * Pikachu constructor.
     */
    public Rayquaza() {
        setName("Rayquaza");
        setHasEvolution(true);
        setHitPoints(HIT_POINTS);
        PokemonType type = new Normal();
        setType(type);
        Attack mainAttack = new ElectroBall();
        setMainAttack(mainAttack);
        Attack secondAttack = new Thunder();
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
