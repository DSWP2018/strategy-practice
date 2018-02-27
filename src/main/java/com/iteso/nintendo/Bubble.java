package com.iteso.nintendo;

/**
 * Bubble.
 */
public class Bubble implements Attack {
    /**
     * Attack damage.
     */
    public static final int ATTACK_DAMAGE = 7;
    /**
     * Attack name.
     */
    public static final String ATTACK_NAME = "Bubble";

    /**
     *
     * @return How pokemon attacks
     */
    @Override
    public final String attackOpponent() {
        return "Aventar burbujas";
    }

    /**
     *
     * @return pokemon animation
     */
    @Override
    public final String animation() {
        return "Agitar manitas";
    }

    /**
     *
     * @return attack damage
     */
    public final int getAttackDamage() {
        return this.ATTACK_DAMAGE;
    }

    /**
     *
     * @return Name attack
     */
    @Override
    public final String getNameAttack() {
        return this.ATTACK_NAME;
    }
}
