package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.Bite;
import com.iteso.nintendo.attacks.Water;
import com.iteso.nintendo.types.PokemonType;
import com.iteso.nintendo.types.WaterType;

public class Squirtle {

    private int lifePoints;
    private Attack mainAttack;
    private Attack secondAttack;
    private PokemonType type;

    public Squirtle() {
        lifePoints = 200;
        mainAttack = new Water();
        secondAttack = new Bite();
        type = new WaterType();
    }
}
