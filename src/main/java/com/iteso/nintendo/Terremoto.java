package com.iteso.nintendo;

public class Terremoto implements Attacks {
    String attack = "Earthquake";
    String attackOponnent = "Attacking opponent with ";
    int attackDamage = 120;

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
