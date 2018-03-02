package com.iteso.nintendo.impl.attacks;

import com.iteso.nintendo.Attack;

/** Class DiamondStorm that implements Attacks. /*
 *
 */
public class DiamondStorm implements Attack {
    /**Declare variables.*/
    /**Name of the attack. */
    private static final String ATTACK_NAME = "Diamond Storm";
    /**Attack damage. */
    private static final int ATTACK_DAMAGE = 90;


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
