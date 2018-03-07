package com.iteso.nintendo.types;

public class Psychic implements PokemonType {

    private String typeName;

    public Psychic() {
        typeName = "Psychic";


    }

    @Override
    public String type() {
        return typeName;
    }

}
