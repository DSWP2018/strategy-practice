package com.iteso.nintendo;

/**
 * ataque llamarada.
 */
public class Ember implements Attack {

    /**
     * nombre de ataque.
     */
    private final String attackName = "Ember";
    /**
     * daño de ataque.
     */
    private final int attackDamage = 12;

    /**
     * tipo.
     */
    private final String type = "fire";

    /**
     * selección de un ataque.
     * @return mensaje de ataque.
     */
    @Override
    public final String attackOpponent() {
        return " ataca con " + this.attackName
                + " intentando hacer " + this.attackDamage + " de daño!";
    }

    /**
     * tipo del ataque.
     * @return tipo.
     */
    @Override
    public final String getAttackType() {
        return this.type;
    }

    /**
     * nombre de ataque.
     * @return nombre.
     */
    @Override
    public final String getAttackName() {
        return this.attackName;
    }

    /**
     * daño de ataque.
     * @return daño.
     */
    @Override
    public final int getAttackDamage() {
        return this.attackDamage;
    }
}

