package com.iteso.nintendo;

public class ElectricType implements Type {
    /**Nombre del tipo. */
    private static final String TYPE_NAME = "Electric";
    /**Defensa. */
    private static final double DEFENSE_MULTIPLIER = 0.3;
    /**Daño. */
    private static final double DAMAGE_MULTIPLIER = 0.7;

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
