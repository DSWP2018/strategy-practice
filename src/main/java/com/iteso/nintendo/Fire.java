package com.iteso.nintendo;
/****/
public class Fire implements PokemonType {
/**VAR.**/
private  static double defenseM;
/**VAR.**/
private final double a = 5;
/**VAR.**/
private final double b = 8;
/**@return String.*/
public final String getType() {
return "Fire";
}
/**@return double.**/
public final double getDefenseMultiplier() {
return defenseM;
}
/**@param attacker PokemonType.
 **/
public final void setDefenseMultiplier(final PokemonType attacker) {
if (attacker.getType().equals("Psychic")) {
Fire.defenseM = a;
}
if (attacker.getType().equals("Electric")) {
Fire.defenseM = a;
}
if (attacker.getType().equals("Bug")) {
Fire.defenseM = b;
}
if (attacker.getType().equals("Steel")) {
Fire.defenseM = b;
}
}
}
