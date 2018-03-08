package com.iteso.nintendo;
/**
 */
public class Dewpider extends PokemonCharacter {
/**Attack.**/
private Attack combate = new Combate();
/**Attack.**/
private Attack cascada = new Cascada();
/**PokemonType.**/
private PokemonType bug = new Bug();
/**
* Hit Points are the maximum life of pokemon.
*/
    public static final int HIT_POINTS = 77;
/**
*constructor.
*/
public Dewpider() {
//setType(bug);
setName("Dewpider");
setHasEvolution(true);
setSecondAttack(cascada);
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
bug.setDefenseMultiplier(attackedby);
damage = (int) (attack * bug.getDefenseMultiplier());
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
return cascada.getAttack();
}
/**@param Attack.*/
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
