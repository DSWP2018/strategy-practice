package com.iteso.nintendo;
/**Class Ventisca.**/
public class Ventisca implements Attack {
/**VAR.**/
private final int i = 14;
/**@return int.**/
public final int getDamage() {
// TODO Auto-generated method stub
return i;
}
/**@return String.**/
public final String getAttack() {
// TODO Auto-generated method stub
String attackMessage = new String(
"Attacking opponent with " + "Ventisca"
+ " causing a damage of " + getDamage());
return attackMessage;
}
}
