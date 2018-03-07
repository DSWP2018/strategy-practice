package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.Bite;
import com.iteso.nintendo.attacks.Water;
import com.iteso.nintendo.types.PokemonType;
import com.iteso.nintendo.types.WaterType;

public class Squirtle {

    private int lifePoints;
    private double defense;
    private PokemonType type;
    private Attack mainAttack;
    private Attack secondAttack;
    private boolean evolve;

    public Squirtle() {
        lifePoints = 200;
        defense = 0.20;
        type = new WaterType();
        mainAttack = new Water();
        secondAttack = new Bite();
        evolve = true;
    }

    public String attackWithMain() {
        return mainAttack.attack();
    }

    public String attackWithSecond() {
        return secondAttack.attack();
    }
}
