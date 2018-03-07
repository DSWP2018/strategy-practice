package com.iteso.nintendo;

/**
 * Nuevo tipo de Pokemon que implementa a la interfaz PokemonType.
 */
public class Roca implements PokemonType {
    /**
     * Variable estática para establecer el nombre del pokemon.
     */
    private static final String TYPE = "Roca";
    /**
     * Variable estática para establecer la defensa maxima que puede obtener.
     */
    private static final double DEFMAX = 1.5;
    /**
     * Variable estática para establecer la defensa mínima que puede obtener.
     */
    private static final double DEFMIN = 1;
    /**
     * Variable estática para establecer el daño máximo que puede obtener.
     */
    private static final double DAMMAX = 3;
    /**
     * Variable estática para establecer el daño mínimo que puede obtener.
     */
    private static final double DAMMIN = 1.5;

    @Override
    public final String getType() {
        return TYPE;
    }

    @Override
    public final double setDamage(final PokemonType type) {
        switch (type.getType()) {
            case "Agua":
                return DAMMAX;
            case "Hierba":
                return DAMMIN;
            default:
                return 0;
        }
    }

    @Override
    public final double setDefense(final PokemonType type) {
        switch (type.getType()) {
            case "Fuego":
                return DEFMAX;
            case "Hielo":
                return DEFMIN;
            default:
                return 0;
        }
    }
}
