package com.iteso.nintendo;

public class Ember implements AttackBehavior{

    private final int damage = 40;
    private final iType type = new Fire();
    private final String name = "Ember";

    public String attackOpponent(PokemonCharacter opponent) {
        String attackMessage =  new String("Attacking " + opponent.getName() + " with" +
                name + " causing a damage of " + opponent.defend(this));
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
