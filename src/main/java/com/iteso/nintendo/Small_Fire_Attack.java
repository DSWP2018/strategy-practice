package com.iteso.nintendo;

public class Small_Fire_Attack implements Attack {
	/**
     * Damage from 1 - 20.
     */
    public static final int ATTACK_DAMAGE = 17;
	
	public String attackOpponent() {
		// TODO Auto-generated method stub
		return "Attacking opponent with "
                + this
                + " causing a damage of " + ATTACK_DAMAGE;
	}
	
	@Override
	public String toString() {
		return "Small Fire";
	}

}
