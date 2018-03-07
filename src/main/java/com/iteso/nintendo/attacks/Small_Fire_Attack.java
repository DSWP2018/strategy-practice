package com.iteso.nintendo.attacks;
/**
 * Creado por mí en algún momento.
 */
public class Small_Fire_Attack extends Attack {
	/**
     * Damage from 1 - 20.
     */
    public Small_Fire_Attack() {
    	super.ATTACK_DAMAGE = 17;
	}

	@Override
	public final String toString() {
		return "Small Fire";
	}

}
