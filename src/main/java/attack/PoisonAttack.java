package attack;

import other.PokemonAttack;

public class PoisonAttack implements PokemonAttack{

	@Override
	public String attackOpponent() {
		return "El oponente ha sido atacado con POISON";
	}
	@Override
	public String cancelAttack() {
		return "Ataque cancelado";
	}
	@Override
	public String getAttackName() {
		return "Poison";
	}
	@Override
	public int getAttackDamage() {
		return 3;
	}

}
