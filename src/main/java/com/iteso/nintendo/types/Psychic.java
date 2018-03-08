package com.iteso.nintendo.types;

import com.iteso.nintendo.PokemonType;

/** Class Psychic type. */
public class Psychic implements PokemonType {
    /**Declare variables. */
    private static final String TYPE_NAME = "Psychic"; /**Type of Pokemon. */
    /**Defense multiplier. */
    private static final double DEFENSE_MULTIPLIER = 0.9;
    /**Defense multiplier. */
    private static final double DAMAGE_MULTIPLIER = 0.9;

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
