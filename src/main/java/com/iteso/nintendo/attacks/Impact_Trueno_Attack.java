package com.iteso.nintendo.attacks;
/**
 * Creado por mí en algún momento.
 */
public class Impact_Trueno_Attack extends Attack {
	/**
     * Damage from 1 - 20.
     */
	public Impact_Trueno_Attack() {
		super.ATTACK_DAMAGE = 5;
	}

	@Override
	public final String toString() {
		return "Impact Trueno";
	}
}
