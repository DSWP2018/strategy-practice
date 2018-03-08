package com.iteso.nintendo.Moves;

import com.iteso.nintendo.PokemonAttack;

/**
 *
 */
public class DragonRage implements PokemonAttack {

    /**
     *
     */
    public static final String ATTACK_NAME = "Dragon Rage";

    /**
     *
     */
    public static final int ATTACK_DAMAGE = 100;
    /**
     *
     * @return string of the attack
     */
    @Override
    public final String attackOpponent() {
        return "Attacking opponent with "
                + ATTACK_NAME
                + " causing a damage of " + ATTACK_DAMAGE;
    }

    @Override
    public final String getAttackName() {
        return this.ATTACK_NAME;
    }

    @Override
    public final int getAttackDamage() {
        return this.ATTACK_DAMAGE;
    }
}