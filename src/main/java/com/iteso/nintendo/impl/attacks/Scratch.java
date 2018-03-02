package com.iteso.nintendo.impl.attacks;

import com.iteso.nintendo.Attack;

/** Class Scratch that implements Attacks. /*
 *
 */
public class Scratch implements Attack {
    /**Declare variables.*/
    /**Name of the attack. */
    private static final String ATTACK_NAME = "Scratch";
    /**Attack damage. */
    private static final int ATTACK_DAMAGE = 40;


    @Override
    public final String getAttack() {
        return ATTACK_NAME;
    }

    @Override
    public final int getAttackDamage() {
        return ATTACK_DAMAGE;
    }

    @Override
    public final String attacking() {
        return "attacking opponent with " + getAttack()
                + " causing a damage of " + getAttackDamage();
    }
}
