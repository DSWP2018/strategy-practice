package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Blaziken extends PokemonCharacter {
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
    public Blaziken() {
        setType("fire");
        setName("Blaziken");
        setHasEvolution(true);
        Attack attackfb = new LowKickAttack();
        setSecondAttack(attackfb);
        Attack attackAP = new FireBlazeAttack();
        setMainAttack(attackAP);
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

}