package com.iteso.nintendo;

import com.iteso.nintendo.impl.ElectroBall;
import com.iteso.nintendo.impl.Thunder;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Rayquaza extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 284;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 1.7;

    /**
     * Pikachu constructor.
     */
    public Rayquaza() {
        setType("dragon");
        setName("Rayquaza");
        setHasEvolution(true);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        Attack main_Attack = new ElectroBall();
        setMainAttack(main_Attack);
        Attack second_Attack = new Thunder();
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
