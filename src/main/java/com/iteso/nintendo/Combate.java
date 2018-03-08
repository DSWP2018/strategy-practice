package com.iteso.nintendo;
/**Class combate.**/
public class Combate implements Attack {
/**VAR.**/
private final int i = 4;
/**@return int.**/
public final int getDamage() {
return i;
}
/**@return string.**/
public final String getAttack() {
String attackMessage = new String(
"Attacking opponent with " + "Combate"
+ " causing a damage of " + getDamage());
return attackMessage;
}
}
