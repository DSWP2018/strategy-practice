package pokemons;

import other.PokemonAttack;
import other.PokemonCharacter;
import other.PokemonType;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class Pikachu extends PokemonCharacter {
/**
 * Hit Points are the maximum life of pokemon.
 */
public static final int HIT_POINTS = 100;
/**
 * Defense multiplier value between 0-1.
 */
public static final double DEFENSE_MULTIPLIER = 0.4;
/**
 * Damage from 1 - 20.
 */
public static final int MAIN_ATTACK_DAMAGE = 5;

/**
 * Damage from 1 - 20.
 */
public static final int SECOND_ATTACK_DAMAGE = 4;
/** Attack. */
private PokemonAttack thunder;
/** Attack. */
private PokemonAttack rock;
/** Type. */
private PokemonType electric;

/**
 * Pikachu constructor.
 */
public Pikachu() {
setType(electric);
setName("Pikachu");
setHasEvolution(true);
setMainAttack(thunder);
setSecondAttack(rock);
setHitPoints(HIT_POINTS);
setDefenseMultiplier(DEFENSE_MULTIPLIER);
setMainAttackDamage(MAIN_ATTACK_DAMAGE);
setSecondAttackDamage(SECOND_ATTACK_DAMAGE);
}

@Override
public final String evolve() {
return null;
}

@Override
public final String defend(final int attack) {
int damage;

damage = (int) (attack * getDefenseMultiplier());
int newHP = getHitPoints() - damage;

String defendMessage = new String("Defending attack, damage caused is "
+ damage + " new HP is " + newHP);

setHitPoints(newHP);
return defendMessage;
}

@Override
public final String mainAttack() {
String attackMessage = new String("Attacking opponent with "
+ getMainAttack().getAttackName()
+ " causing a damage of " + getMainAttackDamage());
return attackMessage;
}

@Override
public final String secondAttack() {
String attackMessage = new String("Attacking opponent with "
+ getSecondAttack().getAttackName()
+ " causing a damage of " + getSecondAttackDamage());
return attackMessage;
}

@Override
public void setNewAttack(final int attack,
final int attackDamage, final String newAttack) {
// TODO Auto-generated method stub

}


}
