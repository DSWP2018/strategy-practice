package com.iteso.nintendo;

public class Ventisca implements Attack {
	public int getDamage() {
		// TODO Auto-generated method stub
		return 14;
	}

	public String getAttack() {
		// TODO Auto-generated method stub
		String attackMessage = new String(
				"Attacking opponent with " + "Ventisca" + " causing a damage of " + getDamage());
		return attackMessage;
	}

}
