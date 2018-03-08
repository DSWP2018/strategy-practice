package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Son estaticos para poder accederlos
 * sin hacer una instancia.
 */

public class GroundTypeTest {
    GroundType groundType;

    @Before
    public void setUp(){
        groundType = new GroundType();
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Ground", groundType.getType());
    }

    @Test
    public void getDamageMultiplierTest(){
        Assert.assertEquals(0.2, groundType.getDamageMultiplier(), 0.0);
    }

    @Test
    public void getDefenseMultiplierTest(){
        Assert.assertEquals(0.8, groundType.getDefenseMultiplier(), 0.0);
    }

}