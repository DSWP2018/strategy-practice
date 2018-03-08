package com.iteso.nintendo.pokemon;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.impl.attacks.FireBlast;
import com.iteso.nintendo.impl.attacks.Scratch;
import com.iteso.nintendo.types.Fire;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Charmander extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 100;


    /**
     * Charmander constructor.
     */
    public Charmander() {
        setName("Charmander");
        setHasEvolution(true);
        setHitPoints(HIT_POINTS);
        PokemonType type = new Fire();
        setType(type);
        Attack mainAttack = new FireBlast();
        setMainAttack(mainAttack);
        Attack secondAttack = new Scratch();
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
