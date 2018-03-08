package com.iteso.nintendo;

/**
 * Interfaz para establecer el tipo de un pokemon y sus comportamientos
 */
public interface PokemonType {
    /**
     * Método para obtener el nombre del tipo.
     * @return tipo de pokemon.
     */
    String getType();
    /**
     * Método para establecer el daño sufrido por un ataque.
     * @param type Tipo de pokemon al que se enfrenta.
     * @return daño
     */
    double setDamage(PokemonType type);

    /**
     * Método para establecer la defensa de ataque.
     * @param type Tipo de pokemon al que se enfrenta
     * @return defensa
     */
    double setDefense(PokemonType type);
}