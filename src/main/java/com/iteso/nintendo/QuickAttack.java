package com.iteso.nintendo;

public class QuickAttack implements Attack{
    String name = "quickAttack";
    int damage = 25;

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

    public String getAttackName(){
        return this.name;
    }

    public int getAttackDamage(){
        return this.damage;
    }
}
