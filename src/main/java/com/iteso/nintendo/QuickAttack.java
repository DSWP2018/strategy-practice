package com.iteso.nintendo;

public class QuickAttack implements Attack{

    private String attackName = "Quick Attack";

    private int attackDamage = 15;

    @Override
    public String performAttack() {

        String messagge = new String("Attacking opponent with "
                + attackName
                + " causing a damage of " + attackDamage);

        return messagge;
    }
}
