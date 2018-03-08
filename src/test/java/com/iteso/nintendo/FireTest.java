package com.iteso.nintendo;

import com.iteso.nintendo.PokemonTypes.FireType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FireTest {
    FireType fire;

    @Before
    public void setUp(){
        fire = new FireType();
    }

    @Test
    public void getType(){
        Assert.assertEquals("Fire", fire.getType());
    }
}
