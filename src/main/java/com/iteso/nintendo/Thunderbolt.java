package com.iteso.nintendo;

public class Thunderbolt implements AttackBehavior{

    private final int damage = 90;
    private final iType type = new Electric();
    private final String name = "Thunderbolt";

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

    public String getType(){return type.getName();}
}
