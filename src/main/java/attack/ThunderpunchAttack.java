package attack;

import other.PokemonAttack;

public class ThunderpunchAttack implements PokemonAttack {

	@Override
	public String attackOpponent() {
		return "El oponente ha sido atacado con THUNDERPUNCH";
	}
	@Override
	public String cancelAttack() {
		return "Ataque cancelado";
	}
	@Override
	public String getAttackName() {
		return "ThunderPunch";
	}
	@Override
	public int getAttackDamage() {
		return 6;
	}

}
