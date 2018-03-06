package attack;

import other.PokemonAttack;

public class FireBallAttack implements PokemonAttack {

	@Override
	public String attackOpponent() {
		return "El oponente ha sido atacado con FIREBALL";
	}
	@Override
	public String cancelAttack() {
		return "Ataque cancelado";
	}
	@Override
	public String getAttackName() {
		return "Fireball";
	}
	@Override
	public int getAttackDamage() {
		return 5;
	}

}
