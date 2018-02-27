package com.iteso.nintendo;

public class DigAttack implements PokemonAttack{

	@Override
	public String attackOpponent() {
		return "El oponente ha sido atacado con rocas";
	}
	@Override
	public String cancelAttack() {
		return "Ataque cancelado";
	}
	@Override
	public String getAttackName() {
		return "Roca";
	}
	@Override
	public int getAttackDamage() {
		return 6;
	}

}
