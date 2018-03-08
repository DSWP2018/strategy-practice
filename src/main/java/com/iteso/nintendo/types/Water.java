package com.iteso.nintendo.types;

import com.iteso.nintendo.PokemonType;

/** Class Water type. */
public class Water implements PokemonType {
    /**Declare variables. */
    private static final String TYPE_NAME = "Water"; /**Type of Pokemon. */
    /**Defense multiplier. */
    private static final double DEFENSE_MULTIPLIER = 0.6;
    /**Defense multiplier. */
    private static final double DAMAGE_MULTIPLIER = 0.51;

    @Override
    public final String getType() {
        return TYPE_NAME;
    }

    @Override
    public final double getDefenseMultiplier() {
        return DEFENSE_MULTIPLIER;
    }

    @Override
    public final double getDamageMultiplier() {
        return DAMAGE_MULTIPLIER;
    }
}
