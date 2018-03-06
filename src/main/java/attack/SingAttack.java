package attack;

import other.PokemonAttack;
/** Ataque Sing. */
public class SingAttack implements PokemonAttack {
/** Attack damage. */
private static final int ATTACKDAMAGE = 3;
@Override
public final String attackOpponent() {
return "El oponente ha sido atacado con SING";
}
@Override
public final String cancelAttack() {
return "Ataque cancelado";
}
@Override
public final String getAttackName() {
return "Sing";
}
@Override
public final int getAttackDamage() {
return ATTACKDAMAGE;
}

}
