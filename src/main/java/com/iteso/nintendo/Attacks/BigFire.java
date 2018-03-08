package com.iteso.nintendo.Attacks;

public class BigFire implements Atack
{
    private static int attackDamage = 17;
    private static String name = "BigFire";

    public BigFire(){

    }

    @Override
    public final String attackOpponent() {
        String attackMessage = new String("Attacking opponent with "
                + name
                + " causing a damage of " + attackDamage);
        return attackMessage;
    }

    @Override
    public final int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public final String getAttackName() {
        return name;
    }
}
