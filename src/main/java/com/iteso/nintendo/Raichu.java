package com.iteso.nintendo;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Raichu extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 180;
    /**
     * Defense multiplier value between 0-1.
     */
    public static final double DEFENSE_MULTIPLIER = 0.7;

    /**
     * Pikachu constructor.
     */
    public Raichu() {
        setType("electric");
        setName("Raichu");
        setHasEvolution(true);
        setNewAttack(mainAttack, new Thunderbolt());
        setNewAttack(secondAttack, new Tackle());
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
    public final void setNewAttack(AttackBehavior oldAtk,
                                   AttackBehavior newAtk) {
        oldAtk = newAtk;
    }


}