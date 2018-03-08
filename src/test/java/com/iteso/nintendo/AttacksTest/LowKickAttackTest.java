package com.iteso.nintendo.AttacksTest;

import com.iteso.nintendo.Moves.AncientPowerAttack;
import com.iteso.nintendo.Moves.LowKickAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by julianlz96 on 2/24/18.
 */
public class LowKickAttackTest {

    private LowKickAttack lowKickAttackTest;

    @Before
    public void setUp(){
        lowKickAttackTest = new LowKickAttack();
    }
    @Test
    public void getAttackNameTest(){
        assertEquals("Low Kick", lowKickAttackTest.getAttackName());
    }

    @Test
    public void getAttackDamageTest(){
        assertEquals(15, lowKickAttackTest.getAttackDamage());
    }

}
