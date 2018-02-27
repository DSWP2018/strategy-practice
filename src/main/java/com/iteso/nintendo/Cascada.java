package com.iteso.nintendo;

public class Cascada implements Attack {

	public int getDamage() {
		// TODO Auto-generated method stub
		return 7;
	}

	public String getAttack() {
		// TODO Auto-generated method stub
		String attackMessage = new String(
				"Attacking opponent with " + "Cascada" + " causing a damage of " + getDamage());
		return attackMessage;
	}

}
