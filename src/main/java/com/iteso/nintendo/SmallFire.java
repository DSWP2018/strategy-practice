package com.iteso.nintendo;

public class SmallFire implements Atack
{
    private static int attackDamage = 3;
    private static String name = "SmallFire";

    public SmallFire(){

    }

    @Override
    public String attackOpponent() {
        String attackMessage = new String("Attacking opponent with "
                + name
                + " causing a damage of " + attackDamage);
        return attackMessage;
    }

    @Override
    public int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public String getAttackName() {
        return name;
    }
}