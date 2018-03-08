package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Son estaticos para poder accederlos
 * sin hacer una instancia.
 */

public class WaterAttackTest {
    WaterAttack attack;

    @Before
    public void setUp(){
        attack = new WaterAttack();
    }

    @Test
    public void getAttackTest(){
        Assert.assertEquals("Water Attack", attack.getAttackName());
    }

    @Test
    public void getAttackDamage(){
        Assert.assertEquals(15, attack.getAttackDamage());
    }

}
