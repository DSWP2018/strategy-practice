package com.iteso.nintendo;

/**
 * Type interface.
 */
public interface Type {
    /**
     * Returns an increase or decrease in damage depending on
     * which type is your opponent.
     * @return Increase or decrease in damage
     */
    int attackDamageAffectedByType();

    /**
     * Returns an increase or decrease in defence depending on
     * which type is your opponent.
     * @return Increase or decrease in defence
     */
    double defenseAffectedByType();

    /**
     *
     * @return Name type
     */
    String getTypeName();
}
