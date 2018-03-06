package attack;

import other.PokemonAttack;
/** Ataque FireBall. */
public class FireBallAttack implements PokemonAttack {
/** attackDamage del ataque. */
private static final int ATTACKDAMAGE = 5;

@Override
public final String attackOpponent() {
return "El oponente ha sido atacado con FIREBALL";
}
@Override
public final String cancelAttack() {
return "Ataque cancelado";
}
@Override
public final String getAttackName() {
return "Fireball";
}
@Override
public final int getAttackDamage() {
return ATTACKDAMAGE;
}

}
