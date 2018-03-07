package com.iteso.nintendo;
/**
 * */
public class FuriaDragon implements Attacks {
    /**
     * */
    private static final int ATTACK_DAMAGE = 85;
    /**
     * */
    private static final String ATTACK = "Dragon fury";
    /**
     * */
    private static final String ATTACK_OPPONENT = "Attacking opponent with ";
    /**
     * */
    private static final String ATTACK_TYPE = "Dragon";
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
