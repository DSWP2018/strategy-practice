package com.iteso.nintendo;

public class Mordisco implements Attack {
	public int getDamage() {
		// TODO Auto-generated method stub
		return 5;
	}

	public String getAttack() {
		// TODO Auto-generated method stub
		String attackMessage = new String(
				"Attacking opponent with " + "Mordisco" + " causing a damage of " + getDamage());
		return attackMessage;
	}

}
