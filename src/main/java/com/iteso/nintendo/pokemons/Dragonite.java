package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.EnergyBall;
import com.iteso.nintendo.attacks.Thunder;
import com.iteso.nintendo.types.PokemonType;
import com.iteso.nintendo.types.ThunderType;

public class Dragonite {

    private int lifePoints;
    private double defense;
    private PokemonType type;
    private Attack mainAttack;
    private Attack secondAttack;
    private boolean evolve;

    public Dragonite() {
        lifePoints = 200;
        defense = 0.20;
        type = new ThunderType();
        mainAttack = new EnergyBall();
        secondAttack = new Thunder();
        evolve = false;
    }


    public String attackWithMain() {
        return mainAttack.attack();
    }

    public String attackWithSecond() {
        return secondAttack.attack();
    }
}
