package com.iteso.nintendo;
/**Class steel.**/
public class Steel implements PokemonType {
/**VAR.**/
private static double defenseM;
/**VAR.**/
private final double a = 5;
/**VAR.**/
private final double b = 8;
/**@return String.**/
public final String getType() {
// TODO Auto-generated method stub
return "Steel";
}
/**@return double.**/
public final double getDefenseMultiplier() {
// TODO Auto-generated method stub
return defenseM;
}
/**@param attacker PokemonType.
 **/
public final void setDefenseMultiplier(final PokemonType attacker) {
if (attacker.getType().equals("Fire")) {
Steel.defenseM = a;
}
if (attacker.getType().equals("Electric")) {
Steel.defenseM = b;
}
if (attacker.getType().equals("Bug")) {
Steel.defenseM = a;
}
if (attacker.getType().equals("Steel")) {
Steel.defenseM = b;
}
}
}
