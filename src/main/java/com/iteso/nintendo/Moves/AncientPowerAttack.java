package com.iteso.nintendo.Moves;

import com.iteso.nintendo.Attack;

/**Clase ancientpower. */
public class AncientPowerAttack implements Attack {
    /**Declarar variables */
    private static final String ATTACK_NAME = "Ancient Power"; /**attack name. */
    private  static final int ATTACK_DAMAGE= 17; /**attack damage. */
    private static final String TYPE = "Rock"; /**Tipo de ataque. */

    @Override
    public String attackOpponent() {
        return "Attacking opponent with " + ATTACK_NAME + " causing a damage of " + ATTACK_DAMAGE;
    }

    @Override
    public String defenseTurn() {
        return null;
    }

    @Override
    public String getAttackName() {
        return this.ATTACK_NAME;
    }

    @Override
    public int getAttackDamage() {
        return this.ATTACK_DAMAGE;
    }

    @Override
    public String getTtype() {
        return this.TYPE;
    }
}
