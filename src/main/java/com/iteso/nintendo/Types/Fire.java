package com.iteso.nintendo.Types;

import com.iteso.nintendo.PokemonType;

/**Class Fire. */
public class Fire implements PokemonType {
    /**Constants. */
    private static final double HALF = 0.5; /**Multiplicador a la mitad. */
    /**Functions. */
    /**@return double multiplicador.
     * @param typeAttack tipo del ataque. */
    public final Double getDefenseTypes(final String typeAttack) {
        if (typeAttack.equals("Water") || typeAttack.equals("Ground")
                || typeAttack.equals("Rock")) {
            return 2.0;
        } else if (typeAttack.equals("Fire") || typeAttack.equals("Grass")
                || typeAttack.equals("Ice") || typeAttack.equals("Bug")
                || typeAttack.equals("Steel") || typeAttack.equals("Fairy")
                ) {
            return HALF;
        }
        return 1.0;
    }
    /**@return Type. */
    public final String getTypeName() {
        return "Fire";
    }
}
