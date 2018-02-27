package com.iteso.nintendo;

public class QuickAttack implements Atack
{

    private static int attackDamage =5;
    private static String name = "QuickAttack";

    public QuickAttack(){

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
