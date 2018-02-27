package com.iteso.nintendo;

public class SingAttack implements PokemonAttack {

	@Override
	public String attackOpponent() {
		return "El oponente ha sido atacado con hielo";
	}
	@Override
	public String cancelAttack() {
		return "Ataque cancelado";
	}
	@Override
	public String getAttackName() {
		return "Hielo";
	}
	@Override
	public int getAttackDamage() {
		return 4;
	}

}
