package attack;

import other.PokemonAttack;
/** Ataque Poison. */
public class PoisonAttack implements PokemonAttack {
/** Attack damage. */
private static final int ATTACKDAMAGE = 3;
@Override
public final String attackOpponent() {
return "El oponente ha sido atacado con POISON";
}
@Override
public final String cancelAttack() {
return "Ataque cancelado";
}
@Override
public final String getAttackName() {
return "Poison";
}
@Override
public final int getAttackDamage() {
return ATTACKDAMAGE;
}

}
