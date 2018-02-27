package com.iteso.nintendo;

public interface AttackBehavior {
    String attackOpponent(PokemonCharacter oponent);
    int getDamage();
    String getName();
}
