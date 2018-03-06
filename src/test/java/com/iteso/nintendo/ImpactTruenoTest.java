package com.iteso.nintendo;

import com.iteso.nintendo.attack.BigFire;
import com.iteso.nintendo.attack.ImpactTrueno;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ImpactTruenoTest {

    ImpactTrueno attack;

    @Before
    public void setUp(){
        attack = new ImpactTrueno();
    }

    @Test
    public void getAttackDamageTest(){
        Assert.assertEquals(15, attack.getAttackDamage());
    }

    @Test
    public void getAttackNameTest(){
        Assert.assertEquals("ImpactTrueno", attack.getAttackName());
    }

    @Test
    public void getAttackOpponentTest(){
        Assert.assertEquals("Attacking opponent with " + "ImpactTrueno"
                + " causing a damage of " + "15", attack.attackOpponent());
    }
}
