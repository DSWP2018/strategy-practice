package com.iteso.nintendo;

public interface Attack {
    /**
     * @return regresa el ataque que se usa
     * y el daño que se causa
     */
    public String attackOpponent();

    /**
     * @return regresa el nombre del ataque
     */
    public String getAttackName();

    /**
     * @return regresa el tipo de daño
     */
    public int getAttackDamage();

}
