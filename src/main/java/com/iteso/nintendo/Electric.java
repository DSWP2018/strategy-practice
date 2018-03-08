package com.iteso.nintendo;
/**.**/
public class Electric implements PokemonType {
/**VAR.**/
private static double defenseM;
/**VAR.**/
private final double a = 5;
/**VAR.**/
private final double b = 8;
/**@return String.*/
public final String getType() {
return "Electric";
}
/**@return double.*/
public final double getDefenseMultiplier() {
return defenseM;
}
/**@param attacker PokemonType.
 **/
public final void setDefenseMultiplier(final PokemonType attacker) {
if (attacker.getType().equals("Psychic")) {
Electric.defenseM = a;
}
if (attacker.getType().equals("Electric")) {
Electric.defenseM = a;
}
if (attacker.getType().equals("Bug")) {
Electric.defenseM = b;
}
if (attacker.getType().equals("Steel")) {
Electric.defenseM = b;
}
}
}
