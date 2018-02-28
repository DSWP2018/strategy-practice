package com.iteso.nintendo;

public class WaterGun implements AttackBehavior{

    private final int damage = 40;
    private final iType type = new Water();
    private final String name = "Water Gun";

    public String attackOpponent(PokemonCharacter opponent) {
        String attackMessage =  new String("Attacking " + opponent + " with" +
                name + " causing a damage of " + getDamage());
        return attackMessage;
    }

    public int getDamage(){ return damage; }

    public String getName(){ return name; }

    public String getType(){return type.getName();}
}
