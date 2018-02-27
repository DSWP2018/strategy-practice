package com.iteso.nintendo;

public class FuriaDragon implements Attacks{
    public static final int ATTACK_DAMAGE = 85;
    public static final String ATTACK = "Dragon fury";
    public static final String ATTACK_OPPONENT = "Attacking opponent with ";

    String attack = ATTACK;
    String attackOponnent = ATTACK_OPPONENT;
    int attackDamage = ATTACK_DAMAGE;

    @Override
    public String attackName() {
        return attack;
    }

    @Override
    public int attackDamage() {
        return attackDamage;
    }

    @Override
    public String attackOpponent() {
        return attackOponnent+attack;
    }
}
