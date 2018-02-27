package com.iteso.nintendo;

public class BucleArena implements Attack {
    @Override
    public String getAttackName() {
        return "Bucle Arena";
    }

    @Override
    public int getAttackDamage() {
        return 16;
    }

    @Override
    public String attackOpponent() {
        return "Ataque bucle de arena!";
    }

    @Override
    public String cancelAttack() {
        return "Ataque cancelado";
    }
}
