package com.iteso.nintendo;

public class AcidArmor implements Attack {
    private static int attackDamage = 10;
    private static String name = "AcidArmor";

    public AcidArmor(){

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
