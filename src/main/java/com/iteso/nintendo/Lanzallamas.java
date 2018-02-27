package com.iteso.nintendo;

public class Lanzallamas implements Attacks {
    String attack = "Flamethrower";
    String attackOponnent = "Attacking opponent with ";
    int attackDamage = 80;

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
