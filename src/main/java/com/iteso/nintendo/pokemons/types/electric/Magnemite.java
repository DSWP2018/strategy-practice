package com.iteso.nintendo.pokemons.types.electric;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.Impact_Trueno_Attack;
import com.iteso.nintendo.attacks.Quick_Attack;
import com.iteso.nintendo.pokemons.PokemonCharacter;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Magnemite extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 100;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.4;
    /**
     * Raichu constructor.
     */
    public Magnemite() {
        setType(new Electric_Type());
        setName("Magnemite");
        setHasEvolution(true);
        setSecondAttack(new Impact_Trueno_Attack());
        setMainAttack(new Quick_Attack());
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
        /*setMainAttackDamage(MAIN_ATTACK_DAMAGE);
        setSecondAttackDamage(SECOND_ATTACK_DAMAGE);*/
    }

    @Override
    public final String evolve() {
        return null;
    }

    @Override
    public final void setNewAttack(final int attack, final int attackDamage,
                                   final Attack newAttack) {
        if (attack == 1) {
            setMainAttack(newAttack);
            setMainAttackDamage(attackDamage);
        } else {
            setSecondAttack(newAttack);
            setSecondAttackDamage(attackDamage);
        }
    }


}
