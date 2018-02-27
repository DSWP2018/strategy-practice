package com.iteso.nintendo;

/**
 * Bigfire.
 */
public class BigFire implements Attack {
    /**
     * Attack damage.
     */
    public static final int ATTACK_DAMAGE = 17;
    /**
     * Attack name.
     */
    public static final String ATTACK_NAME = "BigFire";

    /**
     *
     * @return How Pokemon attacks
     */
    @Override
    public final String attackOpponent() {
        return "Aventar bolota de fuego";
    }

    /**
     *
     * @return Pokemon animation
     */
    @Override
    public final String animation() {
        return "Mover manitas rapido";
    }

    /**
     *
     * @return Attack damage
     */
    public final int getAttackDamage() {
        return this.ATTACK_DAMAGE;
    }

    /**
     *
     * @return Attack name
     */
    @Override
    public final String getNameAttack() {
        return this.ATTACK_NAME;
    }
}
