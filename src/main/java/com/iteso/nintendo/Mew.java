package com.iteso.nintendo;

import com.iteso.nintendo.impl.Acid;
import com.iteso.nintendo.impl.DiamondStorm;

/** Class Mew. /*
 *
 */
public class Mew extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 100;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.4;

    /**
     * Bulbasaur constructor.
     */
    public Mew() {
        setType("psiquico");
        setName("Mew");
        setHasEvolution(true);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        Attack main_Attack = new Acid();
        setMainAttack(main_Attack);
        Attack second_Attack = new DiamondStorm();
        setSecondAttack(second_Attack);
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