package com.iteso.nintendo;

/**
 * Tipo de Pokemon.
 */
public class GroundType implements Type {
    /**Nombre del tipo. */
    private static final String TYPE_NAME = "Ground";
    /**Defensa. */
    private static final double DEFENSE_MULTIPLIER = 0.8;
    /**Daño. */
    private static final double DAMAGE_MULTIPLIER = 0.2;

    @Override
    public final String getType() {
        return TYPE_NAME;
    }

    @Override
    public final double getDamageMultiplier() {
        return DAMAGE_MULTIPLIER;
    }

    @Override
    public final double getDefenseMultiplier() {
        return DEFENSE_MULTIPLIER;
    }
}
