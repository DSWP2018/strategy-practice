package com.iteso.nintendo.Type;

import com.iteso.nintendo.PokemonType;


/**
 * Pokemon Type Electric.
 */
public class Electric implements PokemonType {
    /**
     * Nombre del tipo de pokemon.
     */
    private static final String TYPE = "Electric";

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
    public final String getType() {
        return TYPE;
    }

    @Override
    public final double setDamage(final PokemonType type) {
        switch (type.getType()) {
            case "Water":
                return DAMMAX;
            case "Fire":
                return DAMMIN;
            case "Ground":
                return DAMMAX;
            case "Fighting":
                return DAMMAX;
            default:
                return 0;
        }
    }

    @Override
    public final double setDefense(final PokemonType type) {
        switch (type.getType()) {
            case "Water":
                return DEFMAX;
            case "Fire":
                return DEFMAX;
            case "Ground":
                return DEFMIN;
            case "Fighting":
                return DEFMAX;
            default:
                return 0;
        }
    }
}
