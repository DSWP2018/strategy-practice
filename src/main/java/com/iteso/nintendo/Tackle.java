package com.iteso.nintendo;

public class Tackle implements AttackBehavior{

    private final int damage = 35;
    private final String type = "normal";
    private final String name = "Tackle";

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
