package com.iteso.nintendo.Types;

import com.iteso.nintendo.PokemonType;

/**Class Fire. */
public class Ice implements PokemonType {
    /**Functins. **/
    @Override
    public Double getDefenseTypes(String typeAttack) {
        if(typeAttack.equals("Fire") || typeAttack.equals("Fighting")
                || typeAttack.equals("Rock") || typeAttack.equals("Steel")) {
            return 2.0;
        }
        else if(typeAttack.equals("Ice")) {
            return 0.5;
        }
        return 1.0;
    }
    /**@return Type. */
    public String getTypeName() {
        return "Ice";
    }
}
