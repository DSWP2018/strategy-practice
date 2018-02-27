package com.iteso.nintendo.Attacks;

import com.iteso.nintendo.Definitions.Attack;

public class HydroPump implements Attack {
    String attackName = "Hydro Pump";
    int attackDamage = 15;

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
