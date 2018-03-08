package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Son estaticos para poder accederlos
 * sin hacer una instancia.
 */

public class GroundAttackTest {
    GroundAttack attack;

    @Before
    public void setUp(){
        attack = new GroundAttack();
    }

    @Test
    public void getAttackTest(){
        Assert.assertEquals("Ground Attack", attack.getAttackName());
    }

    @Test
    public void getAttackDamage(){
        Assert.assertEquals(30, attack.getAttackDamage());
    }

}
