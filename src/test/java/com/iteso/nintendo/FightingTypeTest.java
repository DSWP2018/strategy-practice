package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Son estaticos para poder accederlos
 * sin hacer una instancia.
 */

public class FightingTypeTest {
    FightingType fightingType;

    @Before
    public void setUp(){
        fightingType = new FightingType();
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Fighting", fightingType.getType());
    }

    @Test
    public void getDamageMultiplierTest(){
        Assert.assertEquals(0.9, fightingType.getDamageMultiplier(), 0.0);
    }

    @Test
    public void getDefenseMultiplierTest(){
        Assert.assertEquals(0.1, fightingType.getDefenseMultiplier(), 0.0);
    }

}
