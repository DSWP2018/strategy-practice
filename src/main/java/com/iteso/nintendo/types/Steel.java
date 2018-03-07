package com.iteso.nintendo.types;

public class Steel implements PokemonType {

    private String typeName;

    public Steel() {
        typeName = "Steel";
    }

    @Override
    public String type() {
        return typeName;
    }

}
