package com.iteso.nintendo;

public class GroundType implements Type {
    /**Nombre del tipo. */
    private static final String TYPE_NAME = "Ground";
    /**Defensa. */
    private static final double DEFENSE_MULTIPLIER = 0.8;
    /**Daño. */
    private static final double DAMAGE_MULTIPLIER = 0.2;

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