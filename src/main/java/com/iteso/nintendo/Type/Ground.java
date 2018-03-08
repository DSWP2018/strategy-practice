package com.iteso.nintendo.Type;

import com.iteso.nintendo.PokemonType;

/**
 * Pokemon Type Ground.
 */
public class Ground implements PokemonType {
    /**
     * Nombre del tipo de pokemon.
     */
    private static final String TYPE = "Ground";

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
    public final String getType() {
        return TYPE;
    }

    @Override
    public final double setDamage(final PokemonType type) {
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
    public final double setDefense(final PokemonType type) {
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
