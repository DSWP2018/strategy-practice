package com.iteso.nintendo;

public class FireBallAttack implements PokemonAttack {

	@Override
	public String attackOpponent() {
		return "El oponente ha sido atacado con fuego";
	}
	@Override
	public String cancelAttack() {
		return "Ataque cancelado";
	}
	@Override
	public String getAttackName() {
		return "Fire";
	}
	@Override
	public int getAttackDamage() {
		return 5;
	}

}
