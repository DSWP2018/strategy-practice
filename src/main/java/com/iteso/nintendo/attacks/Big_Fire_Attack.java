package com.iteso.nintendo.attacks;
/**
 * Creado por mí en algún momento.
 */
public class Big_Fire_Attack extends Attack {
	/**
     * Damage from 1 - 20.
     */
    public Big_Fire_Attack() {
    	super.ATTACK_DAMAGE = 3;
	}

	@Override
	public final String toString() {
		return "Big Fire";
	}
}
