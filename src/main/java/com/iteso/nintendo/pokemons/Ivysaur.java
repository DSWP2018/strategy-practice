package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.AttackResult;
import com.iteso.nintendo.attacks.FlameBurst;
import com.iteso.nintendo.attacks.Growl;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Ivysaur extends PokemonCharacter {
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


    /**
     * Pikachu constructor.
     */
    public Ivysaur() {
        setType("fire");
        setName("Charmander");
        setHasEvolution(true);
        setMainAttack(new FlameBurst());
        setSecondAttack(new Growl());
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);

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

    @Override
    public final AttackResult secondAttack() {
        AttackResult res =  this.getSecondAttack().attackOpponent();
        return res;
    }

    @Override
    public final AttackResult mainAttack() {
        AttackResult res =  this.getMainAttack().attackOpponent();
        return res;
    }

    @Override
    public final void setNewAttack(final int attackNumber, Attack newAttack) {
        if (attackNumber == 1) {
            setMainAttack(newAttack);
        } else {
            setSecondAttack(newAttack);
        }
    }


}
