package com.iteso.nintendo;

public class BigFire implements Attack{
    private String attackName = "Big Fire";

    private int attackDamage = 17;

    @Override
    public String performAttack() {

        String messagge = new String("Attacking opponent with "
                + attackName
                + " causing a damage of " + attackDamage);

        return messagge;
    }
}