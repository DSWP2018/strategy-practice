package com.iteso.nintendo.Attacks;

import com.iteso.nintendo.Definitions.Attack;

public class Tackle implements Attack {
    String attackName = "Tackle";
    int attackDamage = 20;

    @Override
    public String attackOpponent() {
        String attackMessage = new String("Attacking opponent with "
                + getAttackName()
                + " causing a damage of " + getAttackDamage());
        return attackMessage;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public String getAttackName() {
        return attackName;
    }
}
