package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Charmander extends PokemonCharacter {

    /**
     * Primer ataque.
     */
    public final Ember ember = new Ember();
    /**
     * Second attack.
     */
    public final Rage rage = new Rage();
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 77;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.3;
    /**
     * Damage from 1 - 20.
     */
    public static final int MAIN_ATTACK_DAMAGE = 3;
    /**
     * Damage from 1 -25.
     */
    public static final int SECOND_ATTACK_DAMAGE = 17;

    /**
     * Pikachu constructor.
     */
    public Charmander() {
        setType("fire");
        setName("Charmander");
        setHasEvolution(true);
        setSecondAttack(ember);
        setMainAttack(rage);
        setHitPoints(HIT_POINTS);
        setDefenseMultiplier(DEFENSE_MULTIPLIER);
    }

        @Override
        public final String evolve() {
            return null;
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
    public String attackOpponent() {
        return null;
    }
}