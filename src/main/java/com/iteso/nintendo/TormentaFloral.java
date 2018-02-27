package com.iteso.nintendo;

public class TormentaFloral implements Attack {

    @Override
    public String getAttackName() {
        return "Tormenta Floral";
    }

    @Override
    public int getAttackDamage() {
        return 23;
    }

    @Override
    public String attackOpponent() {
        return "Ataque tormenta floral!";
    }

    @Override
    public String cancelAttack() {
        return "Ataque cancelado";
    }
}
