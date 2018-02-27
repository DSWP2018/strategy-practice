package com.iteso.nintendo.Definitions;

public interface Attack {
    /**
     * Método que recibe un pokemon y calcula el daño hecho por el ataque.
     * Toma en cuenta el defense multiplier del pokemon objetivo.
     * @return mensaje de ataque.
     */
    public String attackOpponent();

    public String getAttackName();

    public int getAttackDamage();

}
