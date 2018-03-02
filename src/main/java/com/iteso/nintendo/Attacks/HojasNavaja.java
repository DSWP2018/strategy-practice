package com.iteso.nintendo.Attacks;

import com.iteso.nintendo.Definitions.Attack;
import com.iteso.nintendo.Definitions.PokemonCharacter;
import com.iteso.nintendo.Definitions.PokemonType;

/**
 * Ataque que los objetos PockemonCharacter pueden utilizar.
 */
public class HojasNavaja implements Attack {
    /**
     * Valor del damage.
     */
    static final int DAMAGE = 10;
    /**
     * Atributo de nombre del ataque.
     */
    private String attackName = "Hojas Navaja";

    /**
     * Atributo de daño del ataque.
     */
    private int attackDamage = DAMAGE;

    @Override
    public final String attackOpponent(final PokemonType myType,
            final PokemonCharacter pokemonCharacter) {
        String attackMessage = new String("Attacking opponent with "
                + getAttackName()
                + " causing a damage of "
                + (getAttackDamage()
                + myType.damageAdjustment(pokemonCharacter.getType())));
        return attackMessage;
    }

    /**
     * Metodo para obtener el daño que ejerce este ataque.
     * @return daño del ataque.
     */
    public final int getAttackDamage() {
        return attackDamage;
    }

    /**
     * Metoo para obtener el nombre del ataque.
     * @return nombre del ataque.
     */
    public final String getAttackName() {
        return attackName;
    }

    /**
     * Metodo para establecer el nombre del ataque.
     * @param myAttackName nombre del ataque.
     */
    public final void setAttackName(final String myAttackName) {
        attackName = myAttackName;
    }

    /**
     * Metodo para establecer el daño del ataque.
     * @param myAttackDamage daño del ataque.
     */
    public final void setAttackDamage(final int myAttackDamage) {
        attackDamage = myAttackDamage;
    }
}
