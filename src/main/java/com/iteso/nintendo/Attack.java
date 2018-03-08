package com.iteso.nintendo;

/**
 * Interfaz que especifica los comportamientos de ataque.
 */
public interface Attack{
        /**
         * Método que calcula el daño hecho por el ataque a un oponente.
         * @param type tipo del pokemon que ataca.
         * @param character pokemon que recibe el ataque.
         * @return mensaje de ataque.
         */
        public String attackOpponent(PokemonType type, PokemonCharacter character);


        /**
         * Método que retorna el nombre del ataque.
         * @return nombre ataque.
         */
        public String getAttackName();

        /**
         * Método que retorna el daño del ataque.
         * @return daño.
         */
        public int getAttackDamage();
        }

