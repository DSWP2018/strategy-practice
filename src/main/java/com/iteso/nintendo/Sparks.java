package com.iteso.nintendo;

/**
 * ataque chispas.
 */
public class Sparks implements Attack {
    /**
     * nombre.
     */
    private final String attackName = "Sparks";
    /**
     * daño.
     */
    private final int attackDamage = 16;
    /**
     * tipo.
     */
    private final String type = "electric";

    /**
     * atacar.
     * @return mensaje.
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

