package com.iteso.nintendo.attacks;

/**
 * Created by Diego Galindo.
 */
public class Sleep implements Attack {

    /**
     * Its for the name of the attack.
     */
    private String attackName;
    /**
     * Its for the damage of the attack.
     */
    private static final int DAMAGE = 0;

    /**
     * Sleep Contructor.
     */
    public Sleep() {
        attackName = "Sleep";
    }

    @Override
    public final String attack() {
        return "Pokemon used " + attackName + ".";
    }

    @Override
    public final String attackName() {
        return attackName;
    }

    @Override
    public final int attackDamage() {
        return DAMAGE;
    }
}
