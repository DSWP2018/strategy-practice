package com.iteso.nintendo.Moves;

import com.iteso.nintendo.Attack;

/**Clase ancientpower. */
public class FireBlazeAttack implements Attack {
    /**Declarar variables. */
    private static final String
            ATTACK_NAME = "fire blaze"; /**Nombre del ataque. */
    private  static final int ATTACK_DAMAGE = 20; /**Damage del ataque. */
    private static final String TYPE = "fire"; /**Tipo de ataque. */

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
