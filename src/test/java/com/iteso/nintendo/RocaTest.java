package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RocaTest {

    PokemonType roca, unknownType;

    @Before
    public void setUp(){
        roca = new Roca();
        unknownType = mock(PokemonType.class);
    }

    @Test
    public void setDamageTest(){
        when(unknownType.getType()).thenReturn("Hierba");
        Assert.assertEquals(1.5, roca.setDamage(unknownType), 0.1);
    }

    @Test
    public void setDefenseTest(){
        when(unknownType.getType()).thenReturn("Hielo");
        Assert.assertEquals(1, roca.setDefense(unknownType), 0.1);
    }

}