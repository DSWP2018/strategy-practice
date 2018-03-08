package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Son estaticos para poder accederlos
 * sin hacer una instancia.
 */

public class SoundAttackTest {
    SoundAttack attack;

    @Before
    public void setUp(){
        attack = new SoundAttack();
    }

    @Test
    public void getAttackTest(){
        Assert.assertEquals("Sound Attack", attack.getAttackName());
    }

    @Test
    public void getAttackDamage(){
        Assert.assertEquals(5, attack.getAttackDamage());
    }

}
