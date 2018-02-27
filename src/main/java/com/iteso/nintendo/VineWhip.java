package com.iteso.nintendo;

public class VineWhip implements AttackBehavior{

    private final int damage = 35;
    private final String type = "grass";
    private final String name = "Vine Whip";

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
