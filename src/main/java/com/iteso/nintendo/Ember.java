package com.iteso.nintendo;

public class Ember implements AttackBehavior{

    private final int damage = 40;
    private final String type = "fire";
    private final String name = "Ember";

    public String attackOpponent(PokemonCharacter opponent) {
        String attackMessage =  new String("Attacking " + opponent + " with" +
                name + " causing a damage of " + getDamage());
        return attackMessage;
    }

    public int getDamage(){
        return damage;
    }

    public String getName(){
        return name;
    }
}
