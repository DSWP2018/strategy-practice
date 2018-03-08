package com.iteso.nintendo;

public class Squirtle extends PokemonCharacter {
    /**
     * Hit Points are the maximum life of pokemon.
     */
    public static final int HIT_POINTS = 100;

    /**
     * Pikachu constructor.
     */
    public Squirtle() {
        setType(new ElectricType());
        setName("Squirtle");
        setHasEvolution(true);
        setMainAttack(new WaterAttack());
        setSecondAttack(new GroundAttack());
        setHitPoints(HIT_POINTS);
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
}
