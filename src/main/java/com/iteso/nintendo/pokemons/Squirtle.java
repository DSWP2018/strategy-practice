package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.Bite;
import com.iteso.nintendo.attacks.Water;

public class Squirtle {

    private int lifePoints;
    private Attack mainAttack;
    private Attack secondAttack;

    public Squirtle() {
        lifePoints = 200;
        mainAttack = new Water();
        secondAttack = new Bite();
    }
}
