package com.iteso.nintendo;

import com.iteso.nintendo.PokemonTypes.ElectricType;
import com.iteso.nintendo.PokemonTypes.FireType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElectricTest {

    ElectricType type;

    @Before
    public void setUp(){
        type = new ElectricType();
    }

    @Test
    public void getType(){
        Assert.assertEquals("Electric", type.getType());
    }
}
