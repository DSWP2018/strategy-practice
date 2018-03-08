package com.iteso.nintendo;

import com.iteso.nintendo.Attacks.BigFire;
import com.iteso.nintendo.Attacks.QuickAttack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuickAttackTest {

    QuickAttack attack;

    @Before
    public void setUp(){
        attack = new QuickAttack();
    }

    @Test
    public void getAttackDamageTest(){
        Assert.assertEquals(5, attack.getAttackDamage());
    }

    @Test
    public void getAttackNameTest(){
        Assert.assertEquals("QuickAttack", attack.getAttackName());
    }

    @Test
    public void getAttackOpponentTest(){
        Assert.assertEquals("Attacking opponent with " + "QuickAttack"
                + " causing a damage of " + "5", attack.attackOpponent());
    }
}
