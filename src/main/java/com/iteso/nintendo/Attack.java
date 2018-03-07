package com.iteso.nintendo;

/**
 * Interface para establecer el tipo de ataque de un pokemon.
 */
public interface Attack {
    /**
     * Método para obtener el nombre del ataque.
     * @return String con el nombre.
     */
    String getAttackName();
    /**
     * Método para obtener el daño que causa el ataque.
     * @return int con el daño.
     */
    int getAttackDamage();
    /**
     * Método para atacar al oponente.
     * @return String con frase de ataque.
     */
    String attackOpponent();
    /**
     * Método para cancelar el ataque dirigido.
     * @return String con mensaje de cancelación.
     */
    String cancelAttack();

}
