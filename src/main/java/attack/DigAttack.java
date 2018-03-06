package attack;

import other.PokemonAttack;

public class DigAttack implements PokemonAttack{

	@Override
	public String attackOpponent() {
		return "El oponente ha sido atacado con DIG";
	}
	@Override
	public String cancelAttack() {
		return "Ataque cancelado";
	}
	@Override
	public String getAttackName() {
		return "Dig";
	}
	@Override
	public int getAttackDamage() {
		return 6;
	}

}
