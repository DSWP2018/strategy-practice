package attack;

import other.PokemonAttack;

/** Ataque DIG. */
public class DigAttack implements PokemonAttack {
/** attackDamage del ataque. */
private static final int ATTACKDAMAGE = 6;
@Override
public final String attackOpponent() {
return "El oponente ha sido atacado con DIG";
}
@Override
public final String cancelAttack() {
return "Ataque cancelado";
}
@Override
public final String getAttackName() {
return "Dig";
}
@Override
public final int getAttackDamage() {
return ATTACKDAMAGE;
}

}
