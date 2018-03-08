package com.iteso.nintendo.Types;

import com.iteso.nintendo.PokemonType;

/**Class Fire. */
public class Electric implements PokemonType {
    /**Constants. */
    private static final double HALF = 0.5; /**Multiplicador a la mitad. */
    /**Functins. **/
    @Override
    public final Double getDefenseTypes(final String typeAttack) {
        if (typeAttack.equals("Ground")) {
            return 2.0;
        } else if (typeAttack.equals("Electric") || typeAttack.equals("Flying")
                || typeAttack.equals("Steel")
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
