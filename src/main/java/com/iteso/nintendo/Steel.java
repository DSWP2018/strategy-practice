package com.iteso.nintendo;

/**
 * tipo acero.
 */
public class Steel implements Type {

    /**
     * Devlueve el valor por el que se multiplica el.
     * índice al recicir un ataque de cierto tipo
     * El cálculo de los PH pasa en cada pokemon
     * @param attack manda un ataque. cada ataque tiene un tipo
     * @return evuelve un índice que se usa en la defensa del pokemon
     */
    @Override
    public final double defends(final Attack attack) {
        if (attack.getAttackType().equals("fire")
                || attack.getAttackType().equals("fighting")
                || attack.getAttackType().equals("ground")) {
            return 2;
        } else if (attack.getAttackType().equals("normal")
                || attack.getAttackType().equals("grass")
                || attack.getAttackType().equals("flying")
                || attack.getAttackType().equals("psychic")
                || attack.getAttackType().equals("bug")
                || attack.getAttackType().equals("rock")
                || attack.getAttackType().equals("dragon")
                || attack.getAttackType().equals("steel")
                || attack.getAttackType().equals("fairy")
                || attack.getAttackType().equals("ice")) {
            return 0.5;
        } else if (attack.getAttackType().equals("poison")) {
            return 0;
        } else {
            return 1;
        }
    }
}

