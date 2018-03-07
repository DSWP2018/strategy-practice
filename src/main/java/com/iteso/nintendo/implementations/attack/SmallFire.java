package com.iteso.nintendo.implementations.attack;

import com.iteso.nintendo.Attack;

/**
 * Small fire.
 */
public class SmallFire implements Attack {
    /**
     * Attack damage.
     */
    public static final int ATTACK_DAMAGE = 3;
    /**
     * Attack name.
     */
    public static final String ATTACK_NAME = "Small Fire";

    /**
     *
     * @return Attack
     */
    public final String attackOpponent() {
        return "Aventar bolita de fuego";
    }

    /**
     *
     * @return Animation
     */
    public final String animation() {
        return "Mover manitas lento";
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
     * @return Name attack
     */
    public final String getNameAttack() {
        return this.ATTACK_NAME;
    }
}
