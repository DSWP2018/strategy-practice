package com.iteso.nintendo;

public class Impactrueno implements Attacks {
    String attack = "Thunder volt";
    String attackOponnent = "Attacking opponent with ";
    int attackDamage = 60;

    @Override
    public String attackName() {
        return attack;
    }

    @Override
    public int attackDamage() {
        return attackDamage;
    }

    @Override
    public String attackOpponent() {
        return attackOponnent+attack;
    }
}
