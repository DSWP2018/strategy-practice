package com.iteso.nintendo;

import com.iteso.nintendo.PokemonTypes.WaterType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WaterTest {

    WaterType type;

    @Before
    public void setUp(){
        type = new WaterType();
    }

    @Test
    public void getType(){
        Assert.assertEquals("Water", type.getType());
    }
}
