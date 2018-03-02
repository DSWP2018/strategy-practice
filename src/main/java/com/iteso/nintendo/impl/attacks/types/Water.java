package com.iteso.nintendo.impl.attacks.types;

import com.iteso.nintendo.PokemonType;

/** Class Water type. */
public class Water implements PokemonType {
    /**Declare variables. */
    private static final String TYPE_NAME = "Water"; /**Type of Pokemon*/
    private static final double DEFENSE_MULTIPLIER = 6.0; /**Defense multiplier*/
    private static final double DAMAGE_MULTIPLIER = 5.1; /**Defense multiplier*/

    @Override
    public String getType() {
        return TYPE_NAME;
    }

    @Override
    public double getDefenseMultiplier() {
        return DEFENSE_MULTIPLIER;
    }

    @Override
    public double getDamageMultiplier() {
        return DAMAGE_MULTIPLIER;
    }
}
