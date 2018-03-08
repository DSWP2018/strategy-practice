package com.iteso.nintendo.PokemonTest;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.Moves.AncientPowerAttack;
import com.iteso.nintendo.Moves.IceBeamAttack;
import com.iteso.nintendo.Pokemon.Charmander;
import com.iteso.nintendo.Pokemon.Cranidos;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Fire;
import com.iteso.nintendo.Types.Rock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class CranidosTest {

    private Cranidos cranidos;
    private Attack maintAttk;
    private Attack secondAttk;
    private PokemonType pokTyp;

    @Before //SetUp
    public void setUp(){
        cranidos = new Cranidos();
        maintAttk = mock(AncientPowerAttack.class);
        secondAttk = mock(IceBeamAttack.class);
        pokTyp = mock(Rock.class);
        cranidos.setMainAttack(maintAttk);
        cranidos.setSecondAttack(secondAttk);
        cranidos.setType(pokTyp);
    }

    @Test
    public void evolveTest(){
        assertEquals(null, cranidos.evolve());
    }

    @Test
    public void defend(){
        assertEquals("Defending attack, damage caused is "
        + 15 + " new HP is " + 62, cranidos.defend(25, "Fighting"));
        System.out.println(cranidos.getHitPoints());
    }

}
