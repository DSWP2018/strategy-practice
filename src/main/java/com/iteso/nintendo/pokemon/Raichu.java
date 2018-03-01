package com.iteso.nintendo.pokemon;

import com.iteso.nintendo.type.Water;
import com.iteso.nintendo.attack.Attack;
import com.iteso.nintendo.attack.ImpactTrueno;
import com.iteso.nintendo.attack.QuickAttack;
import com.iteso.nintendo.type.Electric;
import com.iteso.nintendo.type.Fire;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Raichu extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 100;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.4;

    /**
     * Water Less.
     */
    private final int waterLess = 2;
    /**
     * Electic multiplier.
     */
    private final double electicMultiplier = 0.3;
    /**
     * Fire Pluss.
     */
    private final int firePluss = 3;

    /**
     * Raichu constructor.
     */
    public Raichu() {
        setType(new Electric());
        setName("Raichu");
        setHasEvolution(true);
        setSecondAttack(new ImpactTrueno());
        setMainAttack(new QuickAttack());
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
        int newHP;
        if (getType() instanceof Electric) {
            damage = (int) (attack.getAttackDamage()
                    * (getDefenseMultiplier() + electicMultiplier));
        } else if (getType() instanceof Fire) {
            damage = (int) ((attack.getAttackDamage() + firePluss)
                    * getDefenseMultiplier());
        } else if (getType() instanceof Water) {
            damage = (int) ((attack.getAttackDamage()
                    + waterLess)
                    * getDefenseMultiplier());
        } else {
            damage = (int) (attack.getAttackDamage()
                    * getDefenseMultiplier());

        }
        newHP = getHitPoints() - damage;
        defendMessage = new String("Defending attack, "
                + "damage caused is "
                + damage
                + " new HP is "
                + newHP);
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
