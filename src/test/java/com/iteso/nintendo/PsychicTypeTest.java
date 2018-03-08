package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Son estaticos para poder accederlos
 * sin hacer una instancia.
 */

public class PsychicTypeTest {
    PsychicType psychicType;

    @Before
    public void setUp(){
        psychicType = new PsychicType();
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Psychic", psychicType.getType());
    }

    @Test
    public void getDamageMultiplierTest(){
        Assert.assertEquals(0.5, psychicType.getDamageMultiplier(), 0.0);
    }

    @Test
    public void getDefenseMultiplierTest(){
        Assert.assertEquals(0.5, psychicType.getDefenseMultiplier(), 0.0);
    }

}
