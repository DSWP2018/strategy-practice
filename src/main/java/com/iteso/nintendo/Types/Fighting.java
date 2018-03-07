package com.iteso.nintendo.Types;

import com.iteso.nintendo.PokemonType;

/**Class Fire. */
public class Fighting implements PokemonType {
    /**Functins. **/
    @Override
    public Double getDefenseTypes(String typeAttack) {
        if(typeAttack.equals("Flying") || typeAttack.equals("Psychic")
            || typeAttack.equals("Fairy")) {
            return 2.0;
        }
        else if(typeAttack.equals("Bug") || typeAttack.equals("Rock")
                || typeAttack.equals("Dark")
                ) {
            return 0.5;
        }
        return 1.0;
    }
    /**@return Type. */
    public String getTypeName() {
        return "Fighting";
    }
}
