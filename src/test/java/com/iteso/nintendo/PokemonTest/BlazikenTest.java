package com.iteso.nintendo.PokemonTest;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.Moves.AncientPowerAttack;
import com.iteso.nintendo.Moves.IceBeamAttack;
import com.iteso.nintendo.Pokemon.Blaziken;
import com.iteso.nintendo.Pokemon.Pikachu;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Electric;
import com.iteso.nintendo.Types.Fighting;
import com.iteso.nintendo.Types.Fire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by julianlz96 on 2/24/18.
 */
public class BlazikenTest {

    private Blaziken blaziken;
    private Attack maintAttk;
    private Attack secondAttk;
    private PokemonType pokTyp;

    @Before //SetUp
    public void setUp(){
        blaziken = new Blaziken();
        maintAttk = mock(AncientPowerAttack.class);
        secondAttk = mock(IceBeamAttack.class);
        pokTyp = mock(Fire.class);
        blaziken.setMainAttack(maintAttk);
        blaziken.setSecondAttack(secondAttk);
        blaziken.setType(pokTyp);
    }

    @Test
    public void evolveTest(){
        assertEquals(null, blaziken.evolve());
    }

    @Test
    public void defend(){
        assertEquals("Defending attack, damage caused is "
        + 18 + " new HP is " + 59, blaziken.defend(30, "Water"));
        System.out.println(blaziken.getHitPoints());
    }

}
