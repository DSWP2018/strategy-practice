package com.iteso.nintendo.impl;

import com.iteso.nintendo.Attack;

/** Class DiamondStorm that implements Attacks. /*
 *
 */
public class DiamondStorm implements Attack {
    /**Declare variables.*/
    private static final String ATTACK_NAME = "Diamond Storm"; /**Name of the attack. */
    private static final int ATTACK_DAMAGE = 90;


    @Override
    public String getAttack() {
        return ATTACK_NAME;
    }

    @Override
    public int getAttackDamage() {
        return ATTACK_DAMAGE;
    }

    @Override
    public String Attacking() {
        return "Attacking opponent with " + getAttack()
                + " causing a damage of " + getAttackDamage();
    }
}
