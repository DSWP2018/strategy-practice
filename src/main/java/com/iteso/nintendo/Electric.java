package com.iteso.nintendo;

/**
 * tipo eléctrico.
 */
public class Electric implements Type {

    /**
     * Devlueve el valor por el que se multiplica el.
     * índice al recicir un ataque de cierto tipo
     * El cálculo de los PH pasa en cada pokemon
     * @param attack manda un ataque. cada ataque tiene un tipo
     * @return evuelve un índice que se usa en la defensa del pokemon
     */
    @Override
    public final double defends(final Attack attack) {
        if (attack.getAttackType().equals("ground")
                || attack.getAttackType().equals("ice")
                || attack.getAttackType().equals("rock")) {
            return 2;
        } else if (attack.getAttackType().equals("electric")
                || attack.getAttackType().equals("flying")
                || attack.getAttackType().equals("steel")) {
            return 0.5;
        } else {
            return 1;
        }
    }
}

