package com.iteso.nintendo.types;

public class Grass implements PokemonType {

    private String typeName;

    public Grass() {
        typeName = "Grass";
    }

    @Override
    public String type() {
        return typeName;
    }

}
