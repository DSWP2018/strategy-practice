package com.iteso.nintendo;

public class ImpactTrueno implements Atack
{
    private static int attackDamage = 15;
    private static String name = "ImpactTrueno";

    public ImpactTrueno(){

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
