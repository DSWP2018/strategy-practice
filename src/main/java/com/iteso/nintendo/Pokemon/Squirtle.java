package com.iteso.nintendo.Pokemon;

/**
 * Created by rvillalobos on 2/24/18.
 */

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.PokemonType;

/**
 * Clase que extiende PokemonCharacter.
 */
public class Squirtle extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 100;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.4;

    /**
     * Squirtle constructor.
     * @param type tipo de pokemon.
     * @param mainAttack ataque principal.
     * @param secondAttack ataque secundario.
     */
    public Squirtle(final PokemonType type, final Attack mainAttack,
                    final Attack secondAttack) {
        setType(type);
        setName("Squirtle");
        setHasEvolution(true);
        setSecondAttack(secondAttack);
        setMainAttack(mainAttack);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

    @Override
    public final String evolve() {
        return null;
    }

    @Override
    public final String defend(final Attack attack,
                               final PokemonType myType, final PokemonType enemyType) {
        int damage;

        damage = (int) (attack.getAttackDamage() * (getDefenseMultiplier()
                + myType.setDefense(enemyType)));
        int newHP = getHitPoints() - damage;

        String defendMessage = new String("Defending attack, damage caused is "
                + damage + " new HP is " + newHP);

        setHitPoints(newHP);
        return defendMessage;
    }

    @Override
    public final String secondAttack(final PokemonCharacter pokemonCharacter) {
        return getSecondAttack().attackOpponent(this.getType(),
                pokemonCharacter);
    }

    @Override
    public final String mainAttack(final PokemonCharacter pokemonCharacter) {
        return getMainAttack().attackOpponent(this.getType(),
                pokemonCharacter);
    }
}
