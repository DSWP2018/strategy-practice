package com.iteso.nintendo.PokemonTest;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.Moves.AncientPowerAttack;
import com.iteso.nintendo.Moves.FireBlazeAttack;
import com.iteso.nintendo.Moves.IceBeamAttack;
import com.iteso.nintendo.Pokemon.Blaziken;
import com.iteso.nintendo.Pokemon.Cyndaquil;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Fire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by julianlz96 on 2/24/18.
 */
public class CyndaquilTest {

    private Cyndaquil cyndaquil;
    private Attack maintAttk;
    private Attack secondAttk;
    private PokemonType pokTyp;

    @Before //SetUp
    public void setUp(){
        cyndaquil = new Cyndaquil();
        maintAttk = mock(FireBlazeAttack.class);
        secondAttk = mock(AncientPowerAttack.class);
        pokTyp = mock(Fire.class);
        cyndaquil.setMainAttack(maintAttk);
        cyndaquil.setSecondAttack(secondAttk);
        cyndaquil.setType(pokTyp);
    }

    @Test
    public void evolveTest(){
        assertEquals(null, cyndaquil.evolve());
    }

    @Test
    public void defend(){
        assertEquals("Defending attack, damage caused is "
        + 3 + " new HP is " + 74, cyndaquil.defend(22, "Ice"));
        System.out.println(cyndaquil.getHitPoints());
    }

}
