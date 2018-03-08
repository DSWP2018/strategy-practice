package com.iteso.nintendo;

/**
 * ataque furia.
 */
public class Rage implements Attack {

    /**
     * nombre de ataque.
     */
    private final String attackName = "Rage";
    /**
     * daño de ataque.
     */
    private final int attackDamage = 9;

    /**
     * tipo de ataque.
     */
    private final String type = "normal";

    /**
     * efectuar ataque.
     * @return mensaje de ataque.
     */
    @Override
    public final String attackOpponent() {
        return " ataca con " + this.attackName
                + " intentando hacer " + this.attackDamage + " de daño!";
    }

    /**
     * tipo de ataque.
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
     * @return daño
     */
    @Override
    public final int getAttackDamage() {
        return this.attackDamage;
    }
}
