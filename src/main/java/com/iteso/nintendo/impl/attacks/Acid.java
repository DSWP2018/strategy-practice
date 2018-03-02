package com.iteso.nintendo.impl.attacks;

import com.iteso.nintendo.Attack;

/** Class Acid that implements Attacks. /*
 *
 */
public class Acid implements Attack {
    /**Declare variables.*/
    private static final String ATTACK_NAME = "Acid"; /**Name of the attack. */
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
