package com.iteso.nintendo;

/**
 * Interface para establecer el tipo de un pokemon.
 */
public interface PokemonType {
    /**
     * Método para obtener el tipo de pokemon.
     * @return String con el nombre.
     */
    String getType();
    /**
     * Método para configurar el daño sufrido por ataque.
     * @param type señalando el tipo de pokemon que atacó.
     * @return double con el daño causado.
     */
    double setDamage(PokemonType type);
    /**
     * Método para configurar la defensa recuperada.
     * @param type señalando el tipo de pokemon que atacó.
     * @return double con la defensa recuperada.
     */
    double setDefense(PokemonType type);

}
