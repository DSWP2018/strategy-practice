package com.iteso.nintendo.Pokemon;

import com.iteso.nintendo.Moves.AncientPowerAttack;
import com.iteso.nintendo.Attack;
import com.iteso.nintendo.Moves.FireBlazeAttack;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Fire;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Charmander extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 77;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.3;
    /**
     * Damage from 1 - 20.
     */
    public static final int MAIN_ATTACK_DAMAGE = 3;
    /**
     * Damage from 1 -25.
     */
    public static final int SECOND_ATTACK_DAMAGE = 17;

    /**
     * Pikachu constructor.
     */
    public Charmander() {
        //setType("fire");
        setName("Charmander");
        setHasEvolution(true);
        Attack attackfb = new FireBlazeAttack();
        setSecondAttack(attackfb);
        Attack attackAP = new AncientPowerAttack();
        setMainAttack(attackAP);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        PokemonType fire = new Fire();
        setType(fire);
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

