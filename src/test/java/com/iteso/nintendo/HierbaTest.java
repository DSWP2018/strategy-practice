package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HierbaTest {

    PokemonType hierba, unknownType;

    @Before
    public void setUp(){
        hierba = new Hierba();
        unknownType = mock(PokemonType.class);
    }

    @Test
    public void setDamageTest(){
        when(unknownType.getType()).thenReturn("Hielo");
        Assert.assertEquals(0.5, hierba.setDamage(unknownType), 0.1);
    }

    @Test
    public void setDefenseTest(){
        when(unknownType.getType()).thenReturn("Agua");
        Assert.assertEquals(1.5, hierba.setDefense(unknownType), 0.1);
    }

}