package com.iteso.nintendo.AttackUnitTest;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.ZenHeadbutt;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZenHeadbuttUT {
    Attack zenHeadbutt;

    @Before
    public void setUp(){
        zenHeadbutt = new ZenHeadbutt();
    }

    @Test
    public void attackDamage(){
        assertEquals(80, zenHeadbutt.attackDamage());
    }

    @Test
    public void attackName(){
        assertEquals("Flash Cannon", zenHeadbutt.attackName());
    }

    @Test
    public void attackOpponent(){
        assertEquals("Flash Cannon was used", zenHeadbutt.attackOpponent());
    }
}