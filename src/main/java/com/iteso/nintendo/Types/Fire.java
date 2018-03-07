package com.iteso.nintendo.Types;

import com.iteso.nintendo.PokemonType;
/**Class Fire. */
public class Fire implements PokemonType {
    /**Functins. **/
    @Override
    public Double getDefenseTypes(String typeAttack) {
        if(typeAttack.equals("Water") || typeAttack.equals("Ground")
                || typeAttack.equals("Rock")) {
            return 2.0;
        }
        else if(typeAttack.equals("Fire") || typeAttack.equals("Grass")
                || typeAttack.equals("Ice") || typeAttack.equals("Bug")
                || typeAttack.equals("Steel") || typeAttack.equals("Fairy")
                ) {
            return 0.5;
        }
        return 1.0;
    }
    /**@return Type. */
    public String getTypeName() {
        return "Fire";
    }
}
