package com.iteso.nintendo;

/**
 * Created by Federico Ibarra.
 */

public class WaterType implements PokemonType {
    /**
     * ataques normales.
     */
    private static final int  NORMAL = 5;

    /**
     * ataques debiles.
     */
    private static final int  DEBIL = 1;

    /**
     * ataques fuertes.
     */
    private static final int  FUERTE = 10;

    /**
     * @return el nombre del tipo de pokemon.
     */

    public final String getType() {
        return "Water";
    }

    /**
     * @param attackedType el tipo del pokemon que ataco al tipo Water.
     * @return numero entre 1-10entre mas alto mas resistente es atque externo
     */
    public final int defenseFactor(final PokemonType attackedType) {
        final int factor;

        if (attackedType.getType().equals("Fire")) {
            factor = FUERTE;
        } else if (attackedType.getType().equals("Electricity")) {
            factor = DEBIL;
        } else {
            factor = NORMAL;
        }

        return factor;
    }
}
