package com.iteso.nintendo;
/**Class Celesteela.**/
public class Celesteela extends PokemonCharacter {
/**Attack.*/
private Attack mordisco = new Mordisco();
/**Attack.*/
private Attack cascada = new Cascada();
/**PokemonType.*/
private PokemonType steel = new Steel();
/*** Hit Points are the maximum life of pokemon.*/
public static final int HIT_POINTS = 77;
/*** constructor.*/
public Celesteela() {
//setType(steel);
setName("Celesteela");
setHasEvolution(true);
setSecondAttack(cascada);
setMainAttack(mordisco);
setHitPoints(HIT_POINTS);
// setDefenseMultiplier(DEFENSE_MULTIPLIER);
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
steel.setDefenseMultiplier(attackedby);
damage = (int) (attack * steel.getDefenseMultiplier());
int newHP = getHitPoints() - damage;
String defendMessage = new String("Defending attack, damage caused is "
+ damage + " new HP is " + newHP);
setHitPoints(newHP);
return defendMessage;
}
/**@return String.**/
public final String secondAttack() {
return mordisco.getAttack();
}
/**@return String.**/
@Override
public final String mainAttack() {
return cascada.getAttack();
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
