package com.iteso.nintendo.Type;

import com.iteso.nintendo.PokemonType;

public class Ground implements PokemonType {
    /**
     * Nombre del tipo de pokemon.
     */
    private final String type = "Ground";

    /**
     * Defensa maxima que puede obtener.
     */
    private static final double DEFMAX = 4;
    /**
     * Defensa mínima que puede obtener.
     */
    private static final double DEFMIN = 0.5;
    /**
     * Daño máximo que puede obtener.
     */
    private static final double DAMMAX = 2;
    /**
     * Daño mínimo que puede obtener.
     */
    private static final double DAMMIN = 0.5;


    @Override
    public String getType() {
        return type;
    }

    @Override
    public double setDamage(PokemonType type) {
        switch (type.getType()) {
            case "Electric":
                return DAMMIN;
            case "Fire":
                return DAMMAX;
            case "Water":
                return DAMMAX;
            case "Fighting":
                return DAMMIN;
            default:
                return 0;
        }
    }

    @Override
    public double setDefense(PokemonType type) {
        switch (type.getType()) {
            case "Electric":
                return DEFMAX;
            case "Fire":
                return DEFMIN;
            case "Water":
                return DEFMIN;
            case "Fighting":
                return DEFMAX;
            default:
                return 0;
        }
    }
}
