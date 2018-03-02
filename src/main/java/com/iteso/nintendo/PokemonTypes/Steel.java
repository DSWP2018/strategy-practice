package com.iteso.nintendo.PokemonTypes;

import com.iteso.nintendo.Definitions.PokemonType;

/**
 * Tipo de Pokemon que implementa la interfaz PokemonType para
 * describir su comportamiento.
 */
public class Steel implements PokemonType {
    /**
     * Valor positivo numero 1.
     */
    public static final int PLUS_A = 4;
    /**
     * Valor positivo numero 2.
     */
    public static final int PLUS_B = 2;
    /**
     * Valor negativo numero 1.
     */
    public static final int MINUS_A = -4;
    /**
     * Valor negativo numero 2.
     */
    public static final int MINUS_B = -2;
    /**
     * Valor para convertir enteros a decimas.
     */
    public static final double TO_CENTS = 0.1;
    /**
     * Nombre del tipo.
     */
    private String type = "Steel";

    @Override
    public final int damageAdjustment(final PokemonType enemyType) {
        switch (enemyType.getType()) {
            case "Fire":
                return PLUS_B;
            case "Water":
                return MINUS_A;
            case "Grass":
                return PLUS_A;
            case "Earth":
                return MINUS_B;
            default:
                return 0;
        }
    }

    @Override
    public final double defenseAdjustment(final PokemonType enemyType) {
        switch (enemyType.getType()) {
            case "Fire":
                return TO_CENTS * PLUS_B;
            case "Steel":
                return TO_CENTS * MINUS_A;
            case "Grass":
                return TO_CENTS * PLUS_A;
            case "Earth":
                return TO_CENTS * MINUS_B;
            default:
                return 0.0;
        }
    }

    @Override
    public final String getType() {
        return type;
    }

    /**
     * Metodo para nombrar el tipo de Pokemon.
     * @param myType tipo de pokemon.
     */
    public final void setType(final String myType) {
        type = myType;
    }
}
