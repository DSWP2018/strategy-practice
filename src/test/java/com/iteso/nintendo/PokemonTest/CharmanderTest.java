package com.iteso.nintendo.PokemonTest;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.Moves.AncientPowerAttack;
import com.iteso.nintendo.Moves.IceBeamAttack;
import com.iteso.nintendo.Pokemon.Blaziken;
import com.iteso.nintendo.Pokemon.Charmander;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Fire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by julianlz96 on 2/24/18.
 */
public class CharmanderTest {

    private Charmander charmander;
    private Attack maintAttk;
    private Attack secondAttk;
    private PokemonType pokTyp;

    @Before //SetUp
    public void setUp(){
        charmander = new Charmander();
        maintAttk = mock(AncientPowerAttack.class);
        secondAttk = mock(IceBeamAttack.class);
        pokTyp = mock(Fire.class);
        charmander.setMainAttack(maintAttk);
        charmander.setSecondAttack(secondAttk);
        charmander.setType(pokTyp);
    }

    @Test
    public void evolveTest(){
        assertEquals(null, charmander.evolve());
    }

    @Test
    public void defend(){
        assertEquals("Defending attack, damage caused is "
        + 2 + " new HP is " + 75, charmander.defend(15, "Steel"));
        System.out.println(charmander.getHitPoints());
    }

}
