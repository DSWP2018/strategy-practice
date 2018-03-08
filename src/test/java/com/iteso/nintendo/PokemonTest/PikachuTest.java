package com.iteso.nintendo.PokemonTest;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.Moves.AncientPowerAttack;
import com.iteso.nintendo.Moves.IceBeamAttack;
import com.iteso.nintendo.Pokemon.Pikachu;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Electric;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import static org.mockito.Mockito.*;

/**
 * Created by julianlz96 on 2/24/18.
 */
public class PikachuTest {

    private Pikachu pikachu;
    private Attack maintAttk;
    private Attack secondAttk;
    private PokemonType pokTyp;

    @Before //SetUp
    public void setUp(){
        pikachu = new Pikachu();
        maintAttk = mock(AncientPowerAttack.class);
        secondAttk = mock(IceBeamAttack.class);
        pokTyp = mock(Electric.class);
        pikachu.setMainAttack(maintAttk);
        pikachu.setSecondAttack(secondAttk);
        pikachu.setType(pokTyp);
    }

    @Test
    public void evolveTest(){
        assertEquals(null, pikachu.evolve());
    }

    @Test
    public void defend(){
        assertEquals("Defending attack, damage caused is "
        + 16 + " new HP is " + 84, pikachu.defend(20, "Ground"));
        System.out.println(pikachu.getHitPoints());
    }

}
