package com.iteso.nintendo.Types;

import com.iteso.nintendo.PokemonType;

/**Class Fire. */
public class Ice implements PokemonType {
    /**Constants. */
    private static final double HALF = 0.5; /**Multiplicador a la mitad. */
    /**Functions. */
    /**@return double multiplicador.
     * @param typeAttack tipo del ataque. */
    public final Double getDefenseTypes(final String typeAttack) {
        if (typeAttack.equals("Fire") || typeAttack.equals("Fighting")
                || typeAttack.equals("Rock") || typeAttack.equals("Steel")) {
            return 2.0;
        } else if (typeAttack.equals("Ice")) {
            return HALF;
        }
        return 1.0;
    }
    /**@return Type. */
    public final String getTypeName() {
        return "Ice";
    }
}
