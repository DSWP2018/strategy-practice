package com.iteso.nintendo.attacks;

/**
 * Created by Diego Galindo.
 */
public class FireBall implements Attack {

    /**
     * Its for the name of the attack.
     */
    private String attackName;
    /**
     * Its for the damage of the attack.
     */
    private static final int DAMAGE = 20;

    /**
     * FireBall Contructor.
     */
    public FireBall() {
        attackName = "Fire ball";
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
