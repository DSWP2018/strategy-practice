package com.iteso.nintendo;

public class ImpactTrueno implements Attack{

    private String attackName = "Impact Trueno";

    private int attackDamage = 12;

    @Override
    public String performAttack() {

        String messagge = new String("Attacking opponent with "
                + attackName
                + " causing a damage of " + attackDamage);

        return messagge;
    }
}
