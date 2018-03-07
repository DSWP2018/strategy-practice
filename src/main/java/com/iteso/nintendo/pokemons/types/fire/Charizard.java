package com.iteso.nintendo.pokemons.types.fire;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.Big_Fire_Attack;
import com.iteso.nintendo.attacks.Small_Fire_Attack;
import com.iteso.nintendo.pokemons.PokemonCharacter;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Charizard extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 77;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.3;

    /**
     * Charizard constructor.
     */
    public Charizard() {
        setType(new Fire_Type());
        setName("Charizard");
        setHasEvolution(true);
        setSecondAttack(new Big_Fire_Attack());
        setMainAttack(new Small_Fire_Attack());
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
