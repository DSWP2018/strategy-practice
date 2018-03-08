package com.iteso.nintendo;
/****/
public class Mordisco implements Attack {
/**VAR.**/
private final int i = 5;
/**@return int.**/
public final int getDamage() {
return i;
}
/**@return String.**/
public final String getAttack() {
String attackMessage = new String(
"Attacking opponent with " + "Mordisco"
+ " causing a damage of "
+ getDamage());
return attackMessage;
}
}
