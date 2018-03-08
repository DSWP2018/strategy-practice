package com.iteso.nintendo;

import com.iteso.nintendo.Attacks.BigFire;
import com.iteso.nintendo.Attacks.SmallFire;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SmallFireTest {

    SmallFire attack;

    @Before
    public void setUp(){
        attack = new SmallFire();
    }

    @Test
    public void getAttackDamageTest(){
        Assert.assertEquals(3, attack.getAttackDamage());
    }

    @Test
    public void getAttackNameTest(){
        Assert.assertEquals("SmallFire", attack.getAttackName());
    }

    @Test
    public void getAttackOpponentTest(){
        Assert.assertEquals("Attacking opponent with " + "SmallFire"
                + " causing a damage of " + "3", attack.attackOpponent());
    }
}
