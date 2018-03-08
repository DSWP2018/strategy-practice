package com.iteso.nintendo.PokemonTest;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.Moves.AncientPowerAttack;
import com.iteso.nintendo.Moves.IceBeamAttack;
import com.iteso.nintendo.Moves.LowKickAttack;
import com.iteso.nintendo.Pokemon.Blaziken;
import com.iteso.nintendo.Pokemon.Hitmonlee;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Fighting;
import com.iteso.nintendo.Types.Fire;
import com.iteso.nintendo.Types.Rock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by julianlz96 on 2/24/18.
 */
public class HitmonleeTest {

    private Hitmonlee hitmonlee;
    private Attack maintAttk;
    private Attack secondAttk;
    private PokemonType pokTyp;

    @Before //SetUp
    public void setUp(){
        hitmonlee = new Hitmonlee();
        maintAttk = mock(LowKickAttack.class);
        secondAttk = mock(AncientPowerAttack.class);
        pokTyp = mock(Fighting.class);
        hitmonlee.setMainAttack(maintAttk);
        hitmonlee.setSecondAttack(secondAttk);
        hitmonlee.setType(pokTyp);
    }

    @Test
    public void evolveTest(){
        assertEquals(null, hitmonlee.evolve());
    }

    @Test
    public void defend(){
        assertEquals("Defending attack, damage caused is "
        + 14 + " new HP is " + 63, hitmonlee.defend(24, "Flying"));
        System.out.println(hitmonlee.getHitPoints());
    }

}
