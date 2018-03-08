package com.iteso.nintendo.AttacksTest;

import com.iteso.nintendo.Moves.AncientPowerAttack;
import com.iteso.nintendo.Moves.IceBeamAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by julianlz96 on 2/24/18.
 */
public class IceBeamAttackTest {

    private IceBeamAttack iceBeamAttack;

    @Before
    public void setUp(){
        iceBeamAttack = new IceBeamAttack();
    }
    @Test
    public void getAttackNameTest(){
        assertEquals("Ice Beam", iceBeamAttack.getAttackName());
    }

    @Test
    public void getAttackDamageTest(){
        assertEquals(23, iceBeamAttack.getAttackDamage());
    }

}
