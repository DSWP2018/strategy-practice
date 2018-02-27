package com.iteso.nintendo;

public class Terremoto implements Attack {
    @Override
    public String getAttackName() {
        return "Terremoto";
    }

    @Override
    public int getAttackDamage() {
        return 21;
    }

    @Override
    public String attackOpponent() {
        return "Ataque terremoto!";
    }

    @Override
    public String cancelAttack() {
        return "Ataque cancelado";
    }
}
