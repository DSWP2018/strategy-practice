package com.iteso.nintendo.pokemon;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.impl.attacks.ElectroBall;
import com.iteso.nintendo.impl.attacks.Thunder;
import com.iteso.nintendo.impl.attacks.types.Plants;
import com.iteso.nintendo.impl.attacks.types.Psychic;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Pikachu extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 100;

    /**
     * Pikachu constructor.
     */
    public Pikachu() {

        setName("Pikachu");
        setHasEvolution(true);
        setHitPoints(HIT_POINTS);
        PokemonType type = new Psychic();
        setType(type);
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
