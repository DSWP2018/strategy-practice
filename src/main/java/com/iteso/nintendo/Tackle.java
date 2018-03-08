package com.iteso.nintendo;

/**
 * ataque tacleada.
 */
public class Tackle implements Attack {
    /**
     * nombre.
     */
    private final String attackName = "Tackle";
    /**
     * daño.
     */
    private final int attackDamage = 14;
    /**
     * tipo.
     */
    private final String type = "normal";

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

