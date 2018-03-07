package com.iteso.nintendo.types;

public class Fairy implements PokemonType {

    private String typeName;

    public Fairy() {
        typeName = "Fairy";
    }

    @Override
    public String type() {
        return typeName;
    }

}
