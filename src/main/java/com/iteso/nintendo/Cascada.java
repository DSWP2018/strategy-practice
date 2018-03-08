package com.iteso.nintendo;
/**Class Cascada.**/
public class Cascada implements Attack {
/**VAR.**/
private final int damage = 7;
/**@return int.**/
public final int getDamage() {
return damage;
}
/**@return String.**/
public final String getAttack() {
/**Class Bug.**/
String attackMessage = new String(
"Attacking opponent with " + "Cascada" + " causing a damage of "
+ getDamage());
return attackMessage;
}
}
