package com.iteso.nintendo.Types;

import com.iteso.nintendo.PokemonType;

/**Class Fire. */
public class Rock implements PokemonType {
    /**Functins. **/
    @Override
    public Double getDefenseTypes(String typeAttack) {
        if(typeAttack.equals("Water") || typeAttack.equals("Grass")
                || typeAttack.equals("Fighting")
                || typeAttack.equals("Ground") || typeAttack.equals("Steel")
                ) {
            return 2.0;
        }
        else if(typeAttack.equals("Normal") || typeAttack.equals("Fire")
                || typeAttack.equals("Poison") || typeAttack.equals("Flying")
                ) {
            return 0.5;
        }
        return 1.0;
    }
    /**@return Type. */
    public String getTypeName() {
        return "Rock";
    }
}
