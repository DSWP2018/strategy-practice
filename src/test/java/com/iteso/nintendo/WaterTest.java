package com.iteso.nintendo;

import com.iteso.nintendo.type.Electric;
import com.iteso.nintendo.type.Water;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WaterTest {

    Water type;

    @Before
    public void setUp(){
        type = new Water();
    }

    @Test
    public void getType(){
        Assert.assertEquals("Water", type.getType());
    }
}
