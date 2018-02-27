package com.iteso.nintendo;

public class PoisonAttack implements PokemonAttack{

	@Override
	public String attackOpponent() {
		return "El oponente ha sido atacado con veneno";
	}
	@Override
	public String cancelAttack() {
		return "Ataque cancelado";
	}
	@Override
	public String getAttackName() {
		return "Veneno";
	}
	@Override
	public int getAttackDamage() {
		return 3;
	}

}
