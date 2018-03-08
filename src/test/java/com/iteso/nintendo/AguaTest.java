package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AguaTest {

    PokemonType agua, unknownType;

    @Before
    public void setUp(){
        agua = new Agua();
        unknownType = mock(PokemonType.class);
    }

    @Test
    public void setDamageTest(){
        when(unknownType.getType()).thenReturn("Hierba");
        Assert.assertEquals(1, agua.setDamage(unknownType), 0.1);
    }

    @Test
    public void setDefenseTest(){
        when(unknownType.getType()).thenReturn("Fuego");
        Assert.assertEquals(2, agua.setDefense(unknownType), 0.1);
    }

}
