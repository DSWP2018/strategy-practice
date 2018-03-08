package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FuegoTest {

    PokemonType fuego, unknownType;

    @Before
    public void setUp(){
        fuego = new Fuego();
        unknownType = mock(PokemonType.class);
    }

    @Test
    public void setDamageTest(){
        when(unknownType.getType()).thenReturn("Roca");
        Assert.assertEquals(1, fuego.setDamage(unknownType), 0.1);
    }

    @Test
    public void setDefenseTest(){
        when(unknownType.getType()).thenReturn("Hielo");
        Assert.assertEquals(.5, fuego.setDefense(unknownType), 0.1);
    }

}