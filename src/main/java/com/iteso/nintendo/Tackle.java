package com.iteso.nintendo;

public class Tackle implements Attack {
    String name = "tackle";
    int damage = 8;

    @Override
    public String attackOpponent() {
        String attackMessage = new String("Attacking opponent with "
                + getAttackName()
                + " causing a damage of " + getAttackDamage());
        return attackMessage;
    }

    @Override
    public void cancelAttack() {

    }

    @Override
    public String getAttackName() {
        return this.name;
    }

    @Override
    public int getAttackDamage() {
        return this.damage;
    }
}
