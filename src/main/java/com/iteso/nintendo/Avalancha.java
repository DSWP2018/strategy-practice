package com.iteso.nintendo;

public class Avalancha implements Attack {
    @Override
    public String getAttackName() {
        return "Avalancha";
    }

    @Override
    public int getAttackDamage() {
        return 17;
    }

    @Override
    public String attackOpponent() {
        return "Ataque avalancha!";
    }

    @Override
    public String cancelAttack() {
        return "Ataque cancelado";
    }
}
