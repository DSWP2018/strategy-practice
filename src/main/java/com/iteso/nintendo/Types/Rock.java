package com.iteso.nintendo.Types;

import com.iteso.nintendo.PokemonType;

/**Class Fire. */
public class Rock implements PokemonType {
    /**Constants. */
    private static final double HALF = 0.5; /**Multiplicador a la mitad. */
    /**Functions. */
    /**@return double multiplicador.
     * @param typeAttack tipo del ataque. */
    public final Double getDefenseTypes(final String typeAttack) {
        if (typeAttack.equals("Water") || typeAttack.equals("Grass")
                || typeAttack.equals("Fighting")
                || typeAttack.equals("Ground") || typeAttack.equals("Steel")
                ) {
            return 2.0;
        } else if (typeAttack.equals("Normal") || typeAttack.equals("Fire")
                || typeAttack.equals("Poison") || typeAttack.equals("Flying")
                ) {
            return HALF;
        }
        return 1.0;
    }
    /**@return Type. */
    public final String getTypeName() {
        return "Electric";
    }
}
