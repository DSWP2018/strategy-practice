package com.iteso.nintendo;

import com.iteso.nintendo.impl.ElectroBall;
import com.iteso.nintendo.impl.Thunder;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Cyndaquil extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 116;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.96;

    /**
     * Pikachu constructor.
     */
    public Cyndaquil() {
        setType("fuego");
        setName("Cyndaquil");
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
