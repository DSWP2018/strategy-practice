package com.iteso.nintendo.Pokemon;

import com.iteso.nintendo.PokemonAttack;
import com.iteso.nintendo.Moves.Spark;
import com.iteso.nintendo.Moves.Thunder;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Electric;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Pikachu extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 100;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.4;


    /**
     * Pikachu constructor.
     */
    public Pikachu() {

        setType(new Electric());
        setName("Pikachu");
        setHasEvolution(true);
        setMainAttack(new Spark());
        setSecondAttack(new Thunder());
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);

    }

    @Override
    public final String evolve() {
        return null;
    }

    @Override
    public final String defend(final int attack, final PokemonType opponentType) {
        int damage;

        damage = (int) (attack * getDefenseMultiplier(opponentType));
        int newHP = getHitPoints() - damage;

        String defendMessage = new String("Defending attack, damage caused is "
                + damage + " new HP is " + newHP);

        setHitPoints(newHP);
        return defendMessage;

    }

    @Override
    public final String secondAttack() {

        return getSecondAttack().attackOpponent();


    }

    @Override
    public final String mainAttack() {
        return getMainAttack().attackOpponent();

    }

    @Override
    public final void setNewAttack(final int attack, final PokemonAttack newAttack) {
        if (attack == 1) {
            setMainAttack(newAttack);
        } else {
            setSecondAttack(newAttack);
        }
    }


}
