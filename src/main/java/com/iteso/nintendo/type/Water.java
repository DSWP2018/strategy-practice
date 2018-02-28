package com.iteso.nintendo.type;

/**
 * Water Type.
 */
public class Water implements PokemonType {
    /**
     * Type Name.
     */
    private final String type = "Water";
    @Override
    public final String getType() {
        return type;
    }
}
