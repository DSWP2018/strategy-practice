package com.iteso.nintendo;
/**
 * Created by rvillalobos on 2/24/18.
 */
public class Charmander extends PokemonCharacter {
/**Attack.**/
private Attack combate = new Combate();
/**Attack.**/
private Attack mordisco = new Mordisco();
/**PokemonType.**/
private PokemonType fire = new Fire();
/**
* Hit Points are the maximum life of pokemon.
*/
public static final int HIT_POINTS = 77;
/**
* constructor.
*/
public Charmander() {
//setType(fire);
setName("Charmander");
setHasEvolution(true);
setSecondAttack(mordisco);
setMainAttack(combate);
setHitPoints(HIT_POINTS);
//   setDefenseMultiplier(DEFENSE_MULTIPLIER);
setMainAttackDamage();
setSecondAttackDamage();
}
/**@return String.**/
@Override
public final String evolve() {
return null;
}
/**@return String.**/
@Override
public final String defend(final int attack, final PokemonType attackedby) {
int damage;
fire.setDefenseMultiplier(attackedby);
damage = (int) (attack * fire.getDefenseMultiplier());
int newHP = getHitPoints() - damage;
String defendMessage = new String("Defending attack, damage caused is "
+ damage + " new HP is " + newHP);
setHitPoints(newHP);
return defendMessage;
}
/**@return String.**/
public final String secondAttack() {
return combate.getAttack();
}
/**@return String.**/
@Override
public final String mainAttack() {
return mordisco.getAttack();
}
/**@param Attack.**/
@Override
public final void setNewAttack(final int attack,
final Attack newAttack) {
if (attack == 1) {
setMainAttack(newAttack);
setMainAttackDamage();
} else {
setSecondAttack(newAttack);
setSecondAttackDamage();
}
}
}
