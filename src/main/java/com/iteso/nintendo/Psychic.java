package com.iteso.nintendo;

/**
 * tipo psíquico.
 */
public class Psychic implements Type {

    /**
     * Devlueve el valor por el que se multiplica el.
     * índice al recicir un ataque de cierto tipo
     * El cálculo de los PH pasa en cada pokemon
     * @param attack manda un ataque. cada ataque tiene un tipo
     * @return evuelve un índice que se usa en la defensa del pokemon
     */
    @Override
    public final double defends(final Attack attack) {
        if (attack.getAttackType().equals("bug")
                || attack.getAttackType().equals("ghost")
                || attack.getAttackType().equals("dark")) {
            return 2;
        } else if (attack.getAttackType().equals("psychic")
                || attack.getAttackType().equals("fighting")) {
            return 0.5;
        } else {
            return 1;
        }
    }
}

