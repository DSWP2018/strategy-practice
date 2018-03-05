package com.iteso.nintendo;

import com.iteso.nintendo.implementations.pokemon.Pikachu;
import com.iteso.nintendo.implementations.type.Electric;
import com.iteso.nintendo.implementations.type.Water;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class PikachuTest {
    Pikachu pikachu;
    Type opponent;

    @Before
    public void setUp(){
        pikachu = new Pikachu();
    }

    @Test
    public void pikachuVsWater(){
        opponent = new Water();
        pikachu.getType().setOpponentType(opponent);

        // Pikachu should damage less against a water opponent
        assertTrue(pikachu.getMainAttackDamage() < pikachu.getMainAttack().getAttackDamage());
    }

    @Test
    public void pikachuVsElectric(){
        opponent = new Electric();
        pikachu.getType().setOpponentType(opponent);

        // Pikachu should make the same damage against an electric opponent
        assertTrue(pikachu.getMainAttackDamage() == pikachu.getMainAttack().getAttackDamage());
    }


}
