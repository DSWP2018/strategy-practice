package com.iteso.nintendo.pokemon;

import com.iteso.nintendo.attack.SmallFire;
import com.iteso.nintendo.type.Water;
import com.iteso.nintendo.attack.Attack;
import com.iteso.nintendo.attack.BigFire;
import com.iteso.nintendo.type.Electric;
import com.iteso.nintendo.type.Fire;

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
     * Pikachu constructor.
     */
    public Charmander() {
        setType(new Fire());
        setName("Charmander");
        setHasEvolution(true);
        setSecondAttack(new BigFire());
        setMainAttack(new SmallFire());
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);

    }

    @Override
    public final String evolve() {
        return null;
    }

    @Override
    public final String defend(final Attack attack) {
        int damage;
        String defendMessage;
        if(getType() instanceof Electric){
            damage = (int) (attack.getAttackDamage() * (getDefenseMultiplier() + 2));

            int newHP = getHitPoints() - damage;

            defendMessage = new String("Defending attack, damage caused is "
                    + damage + " new HP is " + newHP);

            setHitPoints(newHP);
        }
        else if(getType() instanceof Fire) {
            damage = (int) ((attack.getAttackDamage() - 3) * (getDefenseMultiplier() + 1));

            int newHP = getHitPoints() - damage;

            defendMessage = new String("Defending attack, damage caused is "
                    + damage + " new HP is " + newHP);

            setHitPoints(newHP);
        }
        else if(getType() instanceof Water){
            damage = (int) ((attack.getAttackDamage() - 2) * getDefenseMultiplier());

            int newHP = getHitPoints() - damage;

            defendMessage = new String("Defending attack, damage caused is "
                    + damage + " new HP is " + newHP);

            setHitPoints(newHP);
        }else{
            damage = (int) (attack.getAttackDamage() * getDefenseMultiplier());

            int newHP = getHitPoints() - damage;

            defendMessage = new String("Defending attack, damage caused is "
                    + damage + " new HP is " + newHP);

            setHitPoints(newHP);
        }
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
    public final void setNewAttack(final int attack,
                                   final Attack newAttack) {
        if (attack == 1) {
            setMainAttack(newAttack);
        } else {
            setSecondAttack(newAttack);
        }
    }


}
