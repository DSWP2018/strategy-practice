package com.iteso.nintendo.Definitions;

/**
 * Interfaz que nos ayuda a implementar el comportamiento de un Pokemon
 * según su tipo.
 */
public interface PokemonType {
    /**
     * Método para obtener el nombre del tipo.
     * @return regresa el tipo de pokemon.
     */
    String getType();
    /**
     * Ajuste de daño por tipo; dependiendo del Type contra el que luche,
     * puede ganar o perder daño.
     * @param enemyType Tipo de pokemos contra el que se enfrenta.
     * @return aumento/decremento de daño.
     */
    int damageAdjustment(PokemonType enemyType);

    /**
     * Ajuste de defensa por tipo; dependiendo del Type contra el que luche,
     * puede ganar o perder defensa.
     * @param enemyType Tipo de pokemos contra el que se enfrenta.
     * @return aumento/decremento de defensa.
     */
    double defenseAdjustment(PokemonType enemyType);
}
