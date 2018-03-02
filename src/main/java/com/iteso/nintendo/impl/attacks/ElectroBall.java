package com.iteso.nintendo.impl.attacks;

import com.iteso.nintendo.Attack;

/** Class ElectroBall that implements Attacks. /*
 *
 */
public class ElectroBall implements Attack {
    /**Declare variables.*/
    /**Name of the attack. */
    private static final String ATTACK_NAME = "Electro Ball";
    /**Attack damage. */
    private static final int ATTACK_DAMAGE = 110;


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
