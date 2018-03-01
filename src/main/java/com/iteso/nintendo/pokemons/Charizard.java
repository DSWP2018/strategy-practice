package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.Bite;
import com.iteso.nintendo.attacks.FireBall;

public class Charizard {

    private int lifePoints;
    private Attack mainAttack;
    private Attack secondAttack;

    public Charizard() {
        lifePoints = 200;
        mainAttack = new FireBall();
        secondAttack = new Bite();
    }

}
