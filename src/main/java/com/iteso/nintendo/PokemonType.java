package com.iteso.nintendo;

/** Interface PokemonType. /*
 *
 */
public interface PokemonType {
    /**Method getType. /*
     *
     * @return get a String with the type of Pokemon.
     */
    public String getType();

    /** Method getDefenseMultiplier. /*
     *
     * @return how the type affects the defense.
     */
    public double getDefenseMultiplier();

    /**Method getDamageMultiplier. /*
     *
     * @return how the type affects the damage.
     */
    public double getDamageMultiplier();
}
