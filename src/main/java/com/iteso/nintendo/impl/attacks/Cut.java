package com.iteso.nintendo.impl.attacks;

import com.iteso.nintendo.Attack;

/** Class Cut that implements Attacks. /*
 *
 */
public class Cut implements Attack {
    /**Declare variables.*/
    private static final String ATTACK_NAME = "Cut"; /**Name of the attack. */
    private static final int ATTACK_DAMAGE = 50;


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
