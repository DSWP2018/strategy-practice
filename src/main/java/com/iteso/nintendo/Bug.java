package com.iteso.nintendo;
/**Class Bug.**/
public class Bug implements PokemonType {
/**VAR.**/
private static double defenseM;
/**VAR.**/
private final double a = 5;
/**VAR.**/
private final double b = 8;
/**@return String.**/
public final String getType() {
return "Bug";
}
/**@return double.**/
public final double getDefenseMultiplier() {
return defenseM;
}
/**@param attacker PokemonType.
***/
public final void setDefenseMultiplier(final PokemonType attacker) {
if (attacker.getType().equals("Fire")) {
Bug.defenseM = a;
}
if (attacker.getType().equals("Electric")) {
Bug.defenseM = b;
}
if (attacker.getType().equals("Bug")) {
Bug.defenseM = a;
}
if (attacker.getType().equals("Steel")) {
Bug.defenseM = a;
}
}
}
