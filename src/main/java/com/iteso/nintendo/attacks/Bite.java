package com.iteso.nintendo.attacks;


/**
 * Created by Diego Galindo.
 */
public class Bite implements Attack {

    /**
     * Its for the name of the attack.
     */
    private String attackName;

    /**
     * Its for the damage of the attack.
     */
    private static final int DAMAGE = 9;

    /**
     * Bite Contructor.
     */
    public Bite() {
        attackName = "Bite";
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
