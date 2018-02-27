package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.EnergyBall;
import com.iteso.nintendo.attacks.Thunder;

public class Dragonite {
    private int lifePoints;
    private Attack mainAttack;
    private Attack secondAttack;

    public Dragonite() {
        lifePoints = 200;
        mainAttack = new EnergyBall();
        secondAttack = new Thunder();
    }

}
