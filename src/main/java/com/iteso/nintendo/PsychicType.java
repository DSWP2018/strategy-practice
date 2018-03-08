package com.iteso.nintendo;

public class PsychicType implements Type {
    /**Nombre del tipo. */
    private static final String TYPE_NAME = "Psychic";
    /**Defensa. */
    private static final double DEFENSE_MULTIPLIER = 0.5;
    /**Daño. */
    private static final double DAMAGE_MULTIPLIER = 0.5;

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
