package com.iteso.nintendo.types;

import com.iteso.nintendo.PokemonType;

/** Class Normal type. */
public class Normal implements PokemonType {
    /**Declare variables. */
    private static final String TYPE_NAME = "Normal"; /**Type of Pokemon. */
    /**Defense multiplier. */
    private static final double DEFENSE_MULTIPLIER = 4.0;
    /**Defense multiplier. */
    private static final double DAMAGE_MULTIPLIER = 6.6;

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
