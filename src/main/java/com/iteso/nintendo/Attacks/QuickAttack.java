package com.iteso.nintendo.Attacks;

public class QuickAttack implements Atack
{

    private static int attackDamage =5;
    private static String name = "QuickAttack";

    public QuickAttack(){

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
