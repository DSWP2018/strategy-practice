package com.iteso.nintendo;

public class FightingType implements Type {
    /**Nombre del tipo. */
    private static final String TYPE_NAME = "Fighting";
    /**Defensa. */
    private static final double DEFENSE_MULTIPLIER = 0.1;
    /**Daño. */
    private static final double DAMAGE_MULTIPLIER = 0.9;

    @Override
    public String getType() {
        return TYPE_NAME;
    }

    @Override
    public double getDamageMultiplier() {
        return DAMAGE_MULTIPLIER;
    }

    @Override
    public double getDefenseMultiplier() {
        return DEFENSE_MULTIPLIER;
    }
}