package com.iteso.nintendo;

/**
 * Nuevo tipo de Pokemon que implementa a la interfaz PokemonType.
 */
public class Fuego implements PokemonType {
    /**
     * Variable estática para establecer el nombre del pokemon.
     */
    private static final String TYPE = "Fuego";
    /**
     * Variable estática para establecer la defensa maxima que puede obtener.
     */
    private static final double DEFMAX = 2;
    /**
     * Variable estática para establecer la defensa mínima que puede obtener.
     */
    private static final double DEFMIN = 0.5;
    /**
     * Variable estática para establecer el daño máximo que puede obtener.
     */
    private static final double DAMMAX = 2.5;
    /**
     * Variable estática para establecer el daño mínimo que puede obtener.
     */
    private static final double DAMMIN = 1;

    @Override
    public final String getType() {
        return TYPE;
    }

    @Override
    public final double setDamage(final PokemonType type) {
        switch (type.getType()) {
            case "Agua":
                return DAMMAX;
            case "Roca":
                return DAMMIN;
            default:
                return 0;
        }
    }

    @Override
    public final double setDefense(final PokemonType type) {
        switch (type.getType()) {
            case "Hierba":
                return DEFMAX;
            case "Hielo":
                return DEFMIN;
            default:
                return 0;
        }
    }
}
