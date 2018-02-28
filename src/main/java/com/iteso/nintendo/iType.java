package com.iteso.nintendo;

/**
 * Interface for types.
 */
public interface iType {
    /**
     * Method to get damage multiplier from an attack.
     * @param type type to calculate.
     * @param damage damage of the attack.
     * @return Value of damage.
     */
    int getFinalDamage(String type, int damage);
    /**
     * Method to get type name.
     * @return Name of the type.
     */
    String getName();
}
