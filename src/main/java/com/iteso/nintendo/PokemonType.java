package com.iteso.nintendo;

/**
 *
 */
public interface PokemonType {
    /**
     *
     * @return a string with the pokemon type
     */
    String getTypeName();

    /**
     * @param opponentType the type of the opponent
     * @return a double value of the defense multiplier
     * this value depends of the pokemon type
     */
    double getDefenseAccordingToType(PokemonType opponentType);

}
