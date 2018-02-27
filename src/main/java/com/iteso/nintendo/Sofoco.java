package com.iteso.nintendo;

public class Sofoco implements Attack {

	public int getDamage() {
		// TODO Auto-generated method stub
		return 20;
	}

	public String getAttack() {
		// TODO Auto-generated method stub
		String attackMessage = new String(
				"Attacking opponent with " + "	Sofoco" + " causing a damage of " + getDamage());
		return attackMessage;
	}

}
