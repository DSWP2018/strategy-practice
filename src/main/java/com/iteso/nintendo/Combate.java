package com.iteso.nintendo;

public class Combate implements Attack {
	public int getDamage() {
		// TODO Auto-generated method stub
		return 4;
	}

	public String getAttack() {
		// TODO Auto-generated method stub
		String attackMessage = new String(
				"Attacking opponent with " + "Combate" + " causing a damage of " + getDamage());
		return attackMessage;
	}
}
