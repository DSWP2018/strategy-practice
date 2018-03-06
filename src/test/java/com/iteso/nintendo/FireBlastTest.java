package com.iteso.nintendo;

import com.iteso.nintendo.attack.BigFire;
import com.iteso.nintendo.attack.FireBlast;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FireBlastTest {

    FireBlast attack;

    @Before
    public void setUp(){
        attack = new FireBlast();
    }

    @Test
    public void getAttackDamageTest(){
        Assert.assertEquals(10, attack.getAttackDamage());
    }

    @Test
    public void getAttackNameTest(){
        Assert.assertEquals("FireBlast", attack.getAttackName());
    }

    @Test
    public void getAttackOpponentTest(){
        Assert.assertEquals("Attacking opponent with " + "FireBlast"
                + " causing a damage of " + "10", attack.attackOpponent());
    }
}
