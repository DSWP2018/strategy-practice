package com.iteso.nintendo.AttackUnitTest;

import com.iteso.nintendo.attacks.;
import com.iteso.nintendo.attacks.FlashCannon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlashCannonUT {
    Attack flashCannon;

    @Before
    public void setUp(){
        flashCannon = new FlashCannon();
    }

    @Test
    public void attackDamage(){
        assertEquals(80, flashCannon.attackDamage());
    }

    @Test
    public void attackName(){
        assertEquals("Flash Cannon", flashCannon.attackName());
    }

    @Test
    public void attackOpponent(){
        assertEquals("Flash Cannon was used", flashCannon.attackOpponent());
    }
}