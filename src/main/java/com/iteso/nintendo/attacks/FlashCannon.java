package com.iteso.nintendo.attacks;

public class FlashCannon implements Attack {

    private static String attackName;
    private String attackType;
    private static int damage;

    public FlashCannon(){
        attackName = "Flash Cannon";
        attackType = "Steel";
        damage = 80;
    }

    public static final int getAttackDamage() {
        return damage;
    }

    public static final String getAttackName() {
        return attackName;
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
    public int attackDamage() {
        return damage;
    }
}
