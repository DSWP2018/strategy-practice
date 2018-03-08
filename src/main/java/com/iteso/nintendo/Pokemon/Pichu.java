package com.iteso.nintendo.Pokemon;

import com.iteso.nintendo.PokemonTypes.WaterType;
import com.iteso.nintendo.Attacks.Atack;
import com.iteso.nintendo.Attacks.ImpactTrueno;
import com.iteso.nintendo.Attacks.QuickAttack;
import com.iteso.nintendo.PokemonTypes.ElectricType;
import com.iteso.nintendo.PokemonTypes.FireType;

public class Pichu extends PokemonCharacter
{
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
    public Pichu() {
        setType(new ElectricType());
        setName("Pichu");
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
    public final String defend(final Atack attack) {
        int damage;
        String defendMessage;
        int newHP;
        if (getType() instanceof ElectricType) {
            damage = (int) (attack.getAttackDamage()
                    * (getDefenseMultiplier() + electicMultiplier));
        } else if (getType() instanceof FireType) {
            damage = (int) ((attack.getAttackDamage() + firePluss)
                    * getDefenseMultiplier());
        } else if (getType() instanceof WaterType) {
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
    public final void setNewAttack(final int attack, final Atack newAttack) {
        if (attack == 1) {
            setMainAttack(newAttack);
        } else {
            setSecondAttack(newAttack);
        }
    }

}
