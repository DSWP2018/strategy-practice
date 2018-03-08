package com.iteso.nintendo;

/**
 * tipo dragon.
 */
public class Dragon implements Type {

    /**
     * Devlueve el valor por el que se multiplica el.
     * índice al recicir un ataque de cierto tipo
     * El cálculo de los PH pasa en cada pokemon
     * @param attack manda un ataque. cada ataque tiene un tipo
     * @return evuelve un índice que se usa en la defensa del pokemon
     */
    @Override
    public final double defends(final Attack attack) {
        if (attack.getAttackType().equals("dragon")
                || attack.getAttackType().equals("ice")
                || attack.getAttackType().equals("fairy")) {
            return 2;
        } else if (attack.getAttackType().equals("grass")
                || attack.getAttackType().equals("fire")
                || attack.getAttackType().equals("electric")
                || attack.getAttackType().equals("water")) {
            return 0.5;
        } else {
            return 1;
        }
    }
}

