package com.iteso.nintendo;

/**
 *ataque rasguño.
 */
public class Scratch implements Attack {

    /**
     * nombre.
     */
    private final String attackName = "Scratch";
    /**
     * daño.
     */
    private final int attackDamage = 7;
    /**
     * tipo.
     */
    private final String type = "normal";

    /**
     * atacar.
     * @return mensaje de ataque.
     */
    @Override
    public final String attackOpponent() {
        return " ataca con " + this.attackName
                + " intentando hacer " + this.attackDamage + " de daño!";
    }

    /**
     * tipo.
     * @return tipo.
     */
    @Override
    public final String getAttackType() {
        return this.type;
    }

    /**
     * nombre.
     * @return nombre.
     */
    @Override
    public final String getAttackName() {
        return this.attackName;
    }

    /**
     * daño.
     * @return daño.
     */
    @Override
    public final int getAttackDamage() {
        return this.attackDamage;
    }
}

