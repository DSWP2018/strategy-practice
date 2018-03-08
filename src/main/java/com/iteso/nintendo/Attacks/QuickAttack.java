package com.iteso.nintendo.Attacks;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.PokemonType;

public class QuickAttack implements Attack {
    private String name = "quickAttack";
    static final int DAMAGE = 25;

    private int attackDamage = DAMAGE;

    @Override
    public final String attackOpponent(final PokemonType myType,
                                       final PokemonCharacter pokemonCharacter) {
        String attackMessage = new String("Attacking opponent with "
                + getAttackName()
                + " causing a damage of "
                + (getAttackDamage()
                + myType.setDamage(pokemonCharacter.getType())));
        return attackMessage;
    }

    @Override
    public void cancelAttack() {

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
        return name;
    }

    /**
     * Metodo para establecer el nombre del ataque.
     * @param myAttackName nombre del ataque.
     */
    public final void setAttackName(final String myAttackName) {
        name = myAttackName;
    }

    /**
     * Metodo para establecer el daño del ataque.
     * @param myAttackDamage daño del ataque.
     */
    public final void setAttackDamage(final int myAttackDamage) {
        attackDamage = myAttackDamage;
    }
}
