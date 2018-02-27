package com.iteso.nintendo.Attacks;

import com.iteso.nintendo.Definitions.Attack;

/**
 * Ataque que los objetos PockemonCharacter pueden utilizar.
 */
public class FireBreath implements Attack {
    /**
     * Valor del damage.
     */
    static final int damage = 15;
    /**
     * Atributo de nombre del ataque.
     */
    private String attackName = "Fire Breath";

    /**
     * Atributo de daño del ataque.
     */
    private int attackDamage = damage;

    @Override
    public final String attackOpponent() {
        String attackMessage = new String("Attacking opponent with "
                + getAttackName()
                + " causing a damage of " + getAttackDamage());
        return attackMessage;
    }

    public final int getAttackDamage() {
        return attackDamage;
    }

    public final String getAttackName() {
        return attackName;
    }

    public final void setAttackName(String attackName) {
        this.attackName = attackName;
    }

    public final void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
}
