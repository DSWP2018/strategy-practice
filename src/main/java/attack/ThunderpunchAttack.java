package attack;

import other.PokemonAttack;
/** Ataque THUNDERPUNCH. */
public class ThunderpunchAttack implements PokemonAttack {
/** Attack damage. */
private static final int ATTACKDAMAGE = 3;
@Override
public final String attackOpponent() {
return "El oponente ha sido atacado con THUNDERPUNCH";
}
@Override
public final String cancelAttack() {
return "Ataque cancelado";
}
@Override
public final String getAttackName() {
return "ThunderPunch";
}
@Override
public final int getAttackDamage() {
return ATTACKDAMAGE;
}

}
