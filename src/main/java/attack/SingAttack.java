package attack;

import other.PokemonAttack;

public class SingAttack implements PokemonAttack {

	@Override
	public String attackOpponent() {
		return "El oponente ha sido atacado con SING";
	}
	@Override
	public String cancelAttack() {
		return "Ataque cancelado";
	}
	@Override
	public String getAttackName() {
		return "Sing";
	}
	@Override
	public int getAttackDamage() {
		return 4;
	}

}
