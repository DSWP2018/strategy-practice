package com.iteso.nintendo;

public class ThunderpunchAttack implements PokemonAttack {

	@Override
	public String attackOpponent() {
		return "El oponente ha sido atacado con rayos";
	}
	@Override
	public String cancelAttack() {
		return "Ataque cancelado";
	}
	@Override
	public String getAttackName() {
		return "Rayo";
	}
	@Override
	public int getAttackDamage() {
		return 6;
	}

}
