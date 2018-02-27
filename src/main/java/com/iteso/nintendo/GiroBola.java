package com.iteso.nintendo;

public class GiroBola implements Attack {
    @Override
    public String getAttackName() {
        return "Giro bola";
    }

    @Override
    public int getAttackDamage() {
        return 5;
    }

    @Override
    public String attackOpponent() {
        return "Ataque giro bola!";
    }

    @Override
    public String cancelAttack() {
        return "Ataque cancelado";
    }
}
