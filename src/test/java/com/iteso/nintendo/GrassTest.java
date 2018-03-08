package com.iteso.nintendo;

import com.iteso.nintendo.PokemonTypes.ElectricType;
import com.iteso.nintendo.PokemonTypes.GrassType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GrassTest {

    GrassType type;

    @Before
    public void setUp(){
        type = new GrassType();
    }

    @Test
    public void getType(){
        Assert.assertEquals("Grass", type.getType());
    }
}
