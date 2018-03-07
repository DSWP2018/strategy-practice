package com.iteso.nintendo.attacks;
/**
 * Creado por mí en algún momento.
 */
public class Quick_Attack extends Attack {
	/**
     * Damage from 1 - 20.
     */
    public Quick_Attack() {
    	super.ATTACK_DAMAGE = 20;
	}

	@Override
	public final String toString() {
		return "Quick Attack";
	}
}
