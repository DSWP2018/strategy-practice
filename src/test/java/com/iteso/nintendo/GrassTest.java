package com.iteso.nintendo;

import com.iteso.nintendo.type.Electric;
import com.iteso.nintendo.type.Grass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GrassTest {

    Grass type;

    @Before
    public void setUp(){
        type = new Grass();
    }

    @Test
    public void getType(){
        Assert.assertEquals("Grass", type.getType());
    }
}
