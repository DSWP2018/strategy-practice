package com.iteso.nintendo;

import com.iteso.nintendo.attack.BigFire;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BigFireTest {

    BigFire attack;

    @Before
    public void setUp(){
        attack = new BigFire();
    }

    @Test
    public void getAttackDamageTest(){
        Assert.assertEquals(17, attack.getAttackDamage());
    }

    @Test
    public void getAttackNameTest(){
        Assert.assertEquals("BigFire", attack.getAttackName());
    }

    @Test
    public void getAttackOpponentTest(){
        Assert.assertEquals("Attacking opponent with " + "BigFire"
                + " causing a damage of " + "17", attack.attackOpponent());
    }
}
