package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Son estaticos para poder accederlos
 * sin hacer una instancia.
 */

public class FireAttackTest {
    FireAttack attack;

    @Before
    public void setUp(){
        attack = new FireAttack();
    }

    @Test
    public void getAttackTest(){
        Assert.assertEquals("Fire Attack", attack.getAttackName());
    }

    @Test
    public void getAttackDamage(){
        Assert.assertEquals(25, attack.getAttackDamage());
    }

}
