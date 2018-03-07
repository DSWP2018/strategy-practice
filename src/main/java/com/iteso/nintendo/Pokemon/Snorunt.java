package com.iteso.nintendo.Pokemon;

import com.iteso.nintendo.Moves.AncientPowerAttack;
import com.iteso.nintendo.Attack;
import com.iteso.nintendo.Moves.IceBeamAttack;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Ice;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Snorunt extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 77;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.3;

    /**
     * Pikachu constructor.
     */
    public Snorunt() {
        //setType("Ice");
        setName("Snorunt");
        setHasEvolution(true);
        Attack attackfb = new AncientPowerAttack();
        setSecondAttack(attackfb);
        Attack attackAP = new IceBeamAttack();
        setMainAttack(attackAP);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        PokemonType ice = new Ice();
        setType(ice);
    }

    @Override
    public final String evolve() {
        return null;
    }

    @Override
    public final String defend(final int attack, final String typePok) {
        int damage;

        damage = (int) (attack * getDefenseMultiplier(typePok));
        int newHP = getHitPoints() - damage;

        String defendMessage = new String("Defending attack, damage caused is "
                + damage + " new HP is " + newHP);

        setHitPoints(newHP);
        return defendMessage;

    }

}