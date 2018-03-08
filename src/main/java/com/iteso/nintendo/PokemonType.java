package com.iteso.nintendo;

/**Create by Julián López. */
public interface PokemonType {
    /**Functions. */
    /**Defenderse del ataque.
     * @param  typeAttack tipo del ataque.
     * @return Double que es el multiplicador.
     * */
    Double getDefenseTypes(String typeAttack);
    /**@return type name.
     * */
    String getTypeName();
}
