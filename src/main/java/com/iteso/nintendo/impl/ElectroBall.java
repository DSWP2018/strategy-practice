package com.iteso.nintendo.impl;

import com.iteso.nintendo.Attack;

/** Class ElectroBall that implements Attacks. /*
 *
 */
public class ElectroBall implements Attack {
    /**Declare variables.*/
    private static final String ATTACK_NAME = "Electro Ball"; /**Name of the attack. */
    private static final int ATTACK_DAMAGE = 110;


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
