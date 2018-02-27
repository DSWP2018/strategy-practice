package com.iteso.nintendo;

public class SmallFire implements Attack {

    private String attackName = "Small Fire";

    private int attackDamage = 3;

    @Override
    public String performAttack() {

        String messagge = new String("Attacking opponent with "
                + attackName
                + " causing a damage of " + attackDamage);

        return messagge;
    }
}