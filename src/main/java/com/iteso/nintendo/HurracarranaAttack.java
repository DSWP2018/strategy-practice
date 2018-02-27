package com.iteso.nintendo;

public class HurracarranaAttack implements Attack{

    private String attackName = "Hurracarrana";

    private int attackDamage = 23;

    @Override
    public String performAttack() {

        String messagge = new String("Attacking opponent with "
                + attackName
                + " causing a damage of " + attackDamage);

        return messagge;
    }
}
