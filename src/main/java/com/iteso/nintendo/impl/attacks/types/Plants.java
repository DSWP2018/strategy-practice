package com.iteso.nintendo.impl.attacks.types;

import com.iteso.nintendo.PokemonType;

/** Class Plants type. */
public class Plants implements PokemonType {
    /**Declare variables. */
    private static final String TYPE_NAME = "Plants"; /**Type of Pokemon*/
    private static final double DEFENSE_MULTIPLIER = 3.0; /**Defense multiplier*/
    private static final double DAMAGE_MULTIPLIER = 7.0; /**Defense multiplier*/

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
