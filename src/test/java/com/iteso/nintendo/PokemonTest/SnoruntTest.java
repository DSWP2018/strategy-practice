package com.iteso.nintendo.PokemonTest;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.Moves.AncientPowerAttack;
import com.iteso.nintendo.Moves.IceBeamAttack;
import com.iteso.nintendo.Pokemon.Pikachu;
import com.iteso.nintendo.Pokemon.Snorunt;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Electric;
import com.iteso.nintendo.Types.Ice;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by julianlz96 on 2/24/18.
 */
public class SnoruntTest {

    private Snorunt snorunt;
    private Attack maintAttk;
    private Attack secondAttk;
    private PokemonType pokTyp;

    @Before //SetUp
    public void setUp(){
        snorunt = new Snorunt();
        maintAttk = mock(AncientPowerAttack.class);
        secondAttk = mock(IceBeamAttack.class);
        pokTyp = mock(Ice.class);
        snorunt.setMainAttack(maintAttk);
        snorunt.setSecondAttack(secondAttk);
        snorunt.setType(pokTyp);
    }

    @Test
    public void evolveTest(){
        assertEquals(null, snorunt.evolve());
    }

    @Test
    public void defend(){
        assertEquals("Defending attack, damage caused is "
        + 12 + " new HP is " + 65, snorunt.defend(20, "Fire"));
        System.out.println(snorunt.getHitPoints());
    }

}
