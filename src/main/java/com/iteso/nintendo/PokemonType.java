package com.iteso.nintendo;

/** Interface PokemonType. /*
 *
 */
public interface PokemonType {
    /**Method getType. /*
     *
     * @return get a String with the type of Pokemon.
     */
    String getType();

    /** Method getDefenseMultiplier. /*
     *
     * @return how the type affects the defense.
     */
    double getDefenseMultiplier();

    /**Method getDamageMultiplier. /*
     *
     * @return how the type affects the damage.
     */
    double getDamageMultiplier();
}
