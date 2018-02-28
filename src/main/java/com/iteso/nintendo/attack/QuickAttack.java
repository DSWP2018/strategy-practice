package com.iteso.nintendo.attack;

import com.iteso.nintendo.attack.Attack;

public class QuickAttack implements Attack {

    private static int attackDamage = 5;
    private static String name = "QuickAttack";

    public QuickAttack(){

    }

    @Override
    public String attackOpponent() {
        String attackMessage = new String("Attacking opponent with "
                + name
                + " causing a damage of " + attackDamage);
        return attackMessage;
    }

    @Override
    public int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public String getAttackName() {
        return name;
    }
}
