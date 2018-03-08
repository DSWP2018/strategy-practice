package com.iteso.nintendo.Moves;

import com.iteso.nintendo.Attack;

/**Clase ancientpower. */
public class AncientPowerAttack implements Attack {
    /**Declarar variables. */
    private static final String
            ATTACK_NAME = "Ancient Power"; /**attack name. */
    private  static final int ATTACK_DAMAGE = 17; /**attack damage. */
    private static final String TYPE = "Rock"; /**Tipo de ataque. */

    @Override
    /**@return nombre de ataque. */
    public final String getAttackName() {
        return this.ATTACK_NAME;
    }

    @Override
    /**@return damage del ataque. */
    public final int getAttackDamage() {
        return this.ATTACK_DAMAGE;
    }

}
