package com.iteso.nintendo;

/**
 * Tipo de Pokemon.
 */
public class FlyingType implements Type {
    /**Nombre del tipo. */
    private static final String TYPE_NAME = "Flying";
    /**Defensa. */
    private static final double DEFENSE_MULTIPLIER = 0.6;
    /**Daño. */
    private static final double DAMAGE_MULTIPLIER = 0.4;

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
