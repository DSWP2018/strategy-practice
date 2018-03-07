package com.iteso.nintendo.Types;

import com.iteso.nintendo.PokemonType;

/**Class Fire. */
public class Electric implements PokemonType {
    /**Functins. **/
    @Override
    public Double getDefenseTypes(String typeAttack) {
        if(typeAttack.equals("Ground")) {
            return 2.0;
        }
        else if(typeAttack.equals("Electric") || typeAttack.equals("Flying")
                || typeAttack.equals("Steel")
                ) {
            return 0.5;
        }
        return 1.0;
    }
    /**@return Type. */
    public String getTypeName() {
        return "Electric";
    }
}
