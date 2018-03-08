package com.iteso.nintendo.Type;

import com.iteso.nintendo.PokemonType;

public class Fighting implements PokemonType {
    /**
     * Nombre del tipo de pokemon.
     */
    private final String type = "Fighting";

    /**
     * Variable estática para establecer la defensa maxima que puede obtener.
     */
    private static final double DEFMAX = 4;
    /**
     * Variable estática para establecer la defensa mínima que puede obtener.
     */
    private static final double DEFMIN = 0.5;
    /**
     * Variable estática para establecer el daño máximo que puede obtener.
     */
    private static final double DAMMAX = 2;
    /**
     * Variable estática para establecer el daño mínimo que puede obtener.
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
            case "Ground":
                return DAMMAX;
            case "Water":
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
            case "Ground":
                return DEFMIN;
            case "Water":
                return DEFMAX;
            default:
                return 0;
        }
    }
}

