package com.iteso.nintendo.Pokemon;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.Moves.FireBlast;
import com.iteso.nintendo.Moves.Flamethrower;
import com.iteso.nintendo.PokemonCharacter;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Vulpix extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 77;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.3;

    /**
     * Psyduck constructor.
     */
    public Vulpix() {
        setType("Fire");
        setName("Vulpix");
        setHasEvolution(true);
        setMainAttack(new FireBlast());
        setSecondAttack(new Flamethrower());
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

    @Override
    public final String evolve() {
        return "";
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
    public final String secondAttack() {

        return getSecondAttack().attackOpponent();


    }

    @Override
    public final String mainAttack() {
        return getMainAttack().attackOpponent();

    }

    @Override
    public final void setNewAttack(final int attack, final Attack newAttack) {
        if (attack == 1) {
            setMainAttack(newAttack);
        } else {
            setSecondAttack(newAttack);
        }
    }


}
