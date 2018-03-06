package pokemons;

import other.PokemonAttack;
import other.PokemonCharacter;
import other.PokemonType;
/** Character Dragonite. */
public class Dragonite extends PokemonCharacter {
/**
 * Hit Points are the maximum life of pokemon.
 */
public static final int HIT_POINTS = 77;
/**
 * Defense multiplier value between 0-1.
 */
public static final double DEFENSE_MULTIPLIER = 0.3;
/**
 * Damage from 1 - 20.
 */
public static final int MAIN_ATTACK_DAMAGE = 3;
/**
 * Damage from 1 -25.
 */
public static final int SECOND_ATTACK_DAMAGE = 17;
/** Attack. */
private PokemonAttack fire;
/** Attack. */
private PokemonAttack punch;
/** Type. */
private PokemonType flying;
/**
 * Pikachu constructor.
 */
public Dragonite() {
setType(flying);
setName("Dragonite");
setHasEvolution(true);
setSecondAttack(punch);
setMainAttack(fire);
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
public final String secondAttack() {
String attackMessage = new String("Attacking opponent with "
+ getSecondAttack()
+ " causing a damage of " + getSecondAttackDamage());
return attackMessage;
}

@Override
public final String mainAttack() {
String attackMessage = new String("Attacking opponent with "
+ getMainAttack()
+ " causing a damage of " + getMainAttackDamage());
return attackMessage;
}

@Override
public final void setNewAttack(final int attack, final int attackDamage,
                               final String newAttack) {
}

}
