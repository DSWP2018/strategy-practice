package com.iteso.nintendo;

public class AtaqueRapido implements Attacks{
    String attack = "Quick Attack";
    String attackOponnent = "Attacking opponent with ";
    int attackDamage = 40;

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
