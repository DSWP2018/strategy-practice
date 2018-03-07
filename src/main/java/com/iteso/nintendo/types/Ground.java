package com.iteso.nintendo.types;

public class Ground implements PokemonType {

    private String typeName;

    public Ground() {
        typeName = "Ground";
    }

    @Override
    public String type() {
        return typeName;
    }

}
