package com.iteso.nintendo.attacks;
/**
 * Creado por mí en algún momento.
 */
public abstract class Attack {
    /**
	 * Daño base del ataque.
	 */
	protected int ATTACK_DAMAGE;
    /**
	 * @return el texto con el ataque realizado
	 */
	public final String attackOpponent() {
		return "Attacking opponent with "
				+ this;
	}
	/**
	 * @return el daño base que causa el ataque
	 */
	public final int getAttackDamage() {
		return ATTACK_DAMAGE;
	}
}
