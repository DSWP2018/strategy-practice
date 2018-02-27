package com.iteso.nintendo.pokemons;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.Bite;
import com.iteso.nintendo.attacks.Sleep;

public class Snorlax {

    private int lifePoints;
    private Attack mainAttack;
    private Attack secondAttack;

    public Snorlax() {
        lifePoints = 200;
        mainAttack = new Sleep();
        secondAttack = new Bite();
    }
    
}
