package com.iteso.nintendo.Attacks;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.PokemonType;
/**
 * Pokemon Attack.
 */
public class MegaKick implements Attack {
    /**
     * private variable to encapsulate the name of the attack.
     */
    private String name = "megaKick";
    /**
     * static final variable to indicate the damage of this attack.
     */
    static final int DAMAGE = 40;
    /**
     * private variable that assigns the attackDamage to the static value.
     */
    private int attackDamage = DAMAGE;

    @Override
    public final String attackOpponent(final PokemonType myType,
                                       final PokemonCharacter character) {
        String attackMessage = new String("Attacking opponent with "
                + getAttackName()
                + " causing a damage of "
                + (getAttackDamage()
                + myType.setDamage(character.getType())));
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
