package com.iteso.nintendo;

public class BigFire implements Atack
{
    private static int attackDamage = 17;
    private static String name = "BigFire";

    public BigFire(){

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
