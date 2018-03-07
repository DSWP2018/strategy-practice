package com.iteso.nintendo;
/**
 * */
public class Terremoto implements Attacks {
    /**
     * */
    private static final int ATTACK_DAMAGE = 120;
    /**
     * */
    private static final String ATTACK = "Earthquake";
    /**
     * */
    private static final String ATTACK_OPPONENT = "Attacking opponent with ";
    /**
     * */
    private static final String ATTACK_TYPE = "Sand";
    /**
     * */
    @Override
    public final String attackName() {
        return ATTACK;
    }
    /**
     * */
    @Override
    public final int attackDamage() {
        return ATTACK_DAMAGE;
    }
    /**
     * */
    @Override
    public final String attackOpponent() {
        return ATTACK_OPPONENT + ATTACK;
    }
    /**
     * */
    @Override
    public final String attackType() {
        return ATTACK_TYPE;
    }
}
