package com.iteso.nintendo.pokemon;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.impl.attacks.*;
import com.iteso.nintendo.impl.attacks.types.*;

/** Class Bulbasaur. /*
 *
 */
public class Bulbasaur extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 118;

    /**
     * Bulbasaur constructor.
     */
    public Bulbasaur() {
        setName("Bulbasaur");
        setHasEvolution(true);
        setHitPoints(HIT_POINTS);
        PokemonType type = new Plants();
        setType(type);
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
