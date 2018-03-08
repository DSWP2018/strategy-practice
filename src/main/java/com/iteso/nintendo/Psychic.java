package com.iteso.nintendo;
/**Class psychic.**/
public class Psychic implements PokemonType {
/**VAR.**/
private  static double defenseM;
/**VAR.**/
private final double a = 5;
/**VAR.**/
private final double b = 8;
/**@return String.**/
public final String getType() {
return "Psychic";
}
/**@return double.**/
public final double getDefenseMultiplier() {
return defenseM;
}
/**@param attacker PokemonType.
 **/
public final void setDefenseMultiplier(final PokemonType attacker) {
if (attacker.getType().equals("Fire")) {
Psychic.defenseM = a;
}
if (attacker.getType().equals("Electric")) {
Psychic.defenseM = b;
}
if (attacker.getType().equals("Bug")) {
Psychic.defenseM = a;
}
if (attacker.getType().equals("Steel")) {
Psychic.defenseM = a;
}
}
}
