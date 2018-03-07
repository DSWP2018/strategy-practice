package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.Bite;
import com.iteso.nintendo.attacks.FireBall;
import com.iteso.nintendo.types.FireType;
import com.iteso.nintendo.types.PokemonType;

public class Charizard {

    private int lifePoints;
    private double defense;
    private Attack mainAttack;
    private Attack secondAttack;
    private PokemonType type;
    private boolean evolve;

    public Charizard() {
        lifePoints = 200;
        defense = 0.20;
        type = new FireType();
        mainAttack = new FireBall();
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
