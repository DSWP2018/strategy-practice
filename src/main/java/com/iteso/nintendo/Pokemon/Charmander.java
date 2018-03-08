package com.iteso.nintendo.Pokemon;

import com.iteso.nintendo.Attacks.Atack;
import com.iteso.nintendo.Attacks.BigFire;
import com.iteso.nintendo.Attacks.FireBlast;
import com.iteso.nintendo.PokemonTypes.ElectricType;
import com.iteso.nintendo.PokemonTypes.FireType;
import com.iteso.nintendo.PokemonTypes.WaterType;


/**
 * Created by rvillalobos on 2/24/18.
 */
public class Charmander extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 100;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.6;
    /**
     * Fire Multiplier.
     */
    private final double fireMultiplier = .2;
    /**
     * Water Pluss.
     */
    private final int waterLess = 2;
    /**
     * ElectricType Less.
     */
    private final int electricPluss = 1;
    /**
     * Charmander constructor.
     */
    public Charmander() {
        setType(new FireType());
        setName("Charmander");
        setHasEvolution(true);
        setSecondAttack(new FireBlast());
        setMainAttack(new BigFire());
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

    @Override
    public final String evolve() {
        return null;
    }

    @Override
    public final String defend(final Atack attack) {
        int damage;
        String defendMessage;
        int newHP;
        if (getType() instanceof ElectricType) {
            damage = (int) ((attack.getAttackDamage()
                    + electricPluss)
                    * getDefenseMultiplier());
        } else if (getType() instanceof FireType) {
            damage = (int) (attack.getAttackDamage()
                    * (getDefenseMultiplier()
                    + fireMultiplier));
        } else if (getType() instanceof WaterType) {
            damage = (int) ((attack.getAttackDamage()
                    - waterLess)
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
    public final void setNewAttack(final int atack, final Atack newAttack) {
        if (atack == 1) {
            setMainAttack(newAttack);
        } else {
            setSecondAttack(newAttack);
        }
    }


}
