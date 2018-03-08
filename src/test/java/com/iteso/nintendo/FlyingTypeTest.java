package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Son estaticos para poder accederlos
 * sin hacer una instancia.
 */

public class FlyingTypeTest {
    FlyingType flyingType;

    @Before
    public void setUp(){
        flyingType = new FlyingType();
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Flying", flyingType.getType());
    }

    @Test
    public void getDamageMultiplierTest(){
        Assert.assertEquals(0.4, flyingType.getDamageMultiplier(), 0.0);
    }

    @Test
    public void getDefenseMultiplierTest(){
        Assert.assertEquals(0.6, flyingType.getDefenseMultiplier(), 0.0);
    }

}
