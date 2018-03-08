package com.iteso.nintendo.AttacksTest;

import com.iteso.nintendo.Moves.AncientPowerAttack;
import com.iteso.nintendo.Moves.FireBlazeAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by julianlz96 on 2/24/18.
 */
public class FireBlastAttackTest {

    private FireBlazeAttack fireBlazeAttack;

    @Before
    public void setUp(){
        fireBlazeAttack = new FireBlazeAttack();
    }
    @Test
    public void getAttackNameTest(){
        assertEquals("Fire Blaze", fireBlazeAttack.getAttackName());
    }

    @Test
    public void getAttackDamageTest(){
        assertEquals(20, fireBlazeAttack.getAttackDamage());
    }

}
