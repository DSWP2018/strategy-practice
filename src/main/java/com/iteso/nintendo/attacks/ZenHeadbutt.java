package com.iteso.nintendo.attacks;

public class ZenHeadbutt implements Attack {

    private String attackName;
    private String attackType;
    private int damage;

    public ZenHeadbutt(){
        attackName = "Flash Cannon";
        attackType = "Psychic";
        damage = 80;
    }

    public final int getAttackDamage() {
        return damage;
    }

    @Override
    public String attack() {
        return "Pokemon used " + attackName + ". It did" + damage + " of damage!";
    }

    @Override
    public String attackName() {
        return attackName;
    }

    @Override
    public String attackType() {
        return attackType;
    }

    @Override
    public String attackOpponent(){ return attackOpponent();}

    @Override
    public int attackDamage() {
        return damage;
    }
}
