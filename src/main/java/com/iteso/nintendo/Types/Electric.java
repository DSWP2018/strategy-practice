package com.iteso.nintendo.Types;

import com.iteso.nintendo.PokemonType;

/**
 *
 */
public class Electric implements PokemonType {

    /**
     *
     */
    private final double resistanceValue = 0.5;
    /**
     *
     */
    private final double weaknessValue = 2;

    /**
     *
     * @return the string with the type name
     */
    @Override
    public final String getTypeName() {
        return "Electric";
    }

    /**
     * @param oType the type of the opponent
     * @return the defense value according with the
     * type of the pokemon that attacked
     * if the opponent type is stronger,
     *  the defense multiplier will increase twice
     * If the type is resistant to the opponent,
     *  the defense multiplier will be divided by 2
     * if the types are indifferent,
     *  the defense multiplier will stay with the same value
     */
    @Override
    public final double getDefenseAccordingToType(final PokemonType oType) {
        if (oType.getTypeName().equals("Flying")) {
            return resistanceValue;
        } else if (oType.getTypeName().equals("Steel")) {
            return resistanceValue;
        } else if (oType.getTypeName().equals("Electric")) {
            return resistanceValue;
        } else if (oType.getTypeName().equals("Ground")) {
            return weaknessValue;
        }
        return 1;
    }

}
