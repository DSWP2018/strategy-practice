package com.iteso.nintendo;

public class FuriaDragon implements Attacks{
    String attack = "Dragon fury";
    String attackOponnent = "Attacking opponent with ";
    int attackDamage = 85;

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
