package com.iteso.nintendo.Pokemons;

import com.iteso.nintendo.Definitions.Attack;
import com.iteso.nintendo.Definitions.PokemonCharacter;
import com.iteso.nintendo.Definitions.PokemonType;

/**
 * Clase que extiende PokemonCharacter.
 */
public class Mudkip extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 90;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.4;

    /**
     * Mudkip constructor.
     * @param type tipo de pokemon.
     * @param mainAttack ataque principal.
     * @param secondAttack ataque secundario.
     */
    public Mudkip(final PokemonType type, final Attack mainAttack,
                  final Attack secondAttack) {
        setType(type);
        setName("Mudkip");
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
                + myType.defenseAdjustment(enemyType)));
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
