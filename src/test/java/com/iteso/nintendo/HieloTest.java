package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HieloTest {

    PokemonType hielo, unknownType;

    @Before
    public void setUp(){
        hielo = new Hielo();
        unknownType = mock(PokemonType.class);
    }

    @Test
    public void setDamageTest(){
        when(unknownType.getType()).thenReturn("Fuego");
        Assert.assertEquals(2.5, hielo.setDamage(unknownType), 0.1);
    }

    @Test
    public void setDefenseTest(){
        when(unknownType.getType()).thenReturn("Agua");
        Assert.assertEquals(2.5, hielo.setDefense(unknownType), 0.1);
    }

}