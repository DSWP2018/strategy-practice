package com.iteso.nintendo.Moves;

import com.iteso.nintendo.Attack;

/**Clase ancientpower. */
public class LowKickAttack implements Attack {
    /**Declarar variables. */
    private static final String
            ATTACK_NAME = "Low Kick"; /**Nombre del ataque. */
    private  static final int ATTACK_DAMAGE = 15; /**Damage del ataque. */
    private static final String TYPE = "Fighting"; /**Tipo del ataque. */

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
