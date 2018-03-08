package com.iteso.nintendo.Types;

import com.iteso.nintendo.PokemonType;

/**
 *
 */
public class Ground implements PokemonType {

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
        return "Ground";
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
        if (oType.getTypeName().equals("Poison")) {
            return resistanceValue;
        } else if (oType.getTypeName().equals("Rock")) {
            return resistanceValue;
        } else if (oType.getTypeName().equals("Water")) {
            return weaknessValue;
        } else if (oType.getTypeName().equals("Ice")) {
            return weaknessValue;
        }  else if (oType.getTypeName().equals("Grass")) {
            return weaknessValue;
        } else if (oType.getTypeName().equals("Electric")) {
            return 0;
        }
        return 1;
    }

}
