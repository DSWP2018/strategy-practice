package com.iteso.nintendo;

import com.iteso.nintendo.impl.Cut;
import com.iteso.nintendo.impl.SeedBomb;

/** Class Bulbasaur. /*
 *
 */
public class Bulbasaur extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 118;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.9;

    /**
     * Bulbasaur constructor.
     */
    public Bulbasaur() {
        setType("planta");
        setName("Bulbasaur");
        setHasEvolution(true);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        Attack main_Attack = new Cut();
        setMainAttack(main_Attack);
        Attack second_Attack = new SeedBomb();
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
