package com.iteso.nintendo;
/**Class sofoco.**/
public class Sofoco implements Attack {
/**VAR.**/
private final int i = 20;
/**@return int.**/
public final int getDamage() {
return i;
}
/**@return string.
**/
public final String getAttack() {
String attackMessage = new String(
"Attacking opponent with " + " Sofoco"
+ " causing a damage of " + getDamage());
return attackMessage;
}
}
