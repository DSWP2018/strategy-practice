package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.Bite;
import com.iteso.nintendo.attacks.Sleep;
import com.iteso.nintendo.types.NormalType;
import com.iteso.nintendo.types.PokemonType;

public class Snorlax {

    private int lifePoints;
    private double defense;
    private PokemonType type;
    private Attack mainAttack;
    private Attack secondAttack;
    private boolean evolve;

    public Snorlax() {
        lifePoints = 200;
        defense = 0.40;
        type = new NormalType();
        mainAttack = new Sleep();
        secondAttack = new Bite();
        evolve = false;
    }


    public String attackWithMain() {
        return mainAttack.attack();
    }

    public String attackWithSecond() {
        return secondAttack.attack();
    }
}
