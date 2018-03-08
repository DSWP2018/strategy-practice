package com.iteso.nintendo.AttacksTest;

import com.iteso.nintendo.Moves.AncientPowerAttack;
import com.iteso.nintendo.Moves.DragonClawAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by julianlz96 on 2/24/18.
 */
public class DragonClawAttackTest {

    private DragonClawAttack dragonClawAttack;

    @Before
    public void setUp(){
        dragonClawAttack = new DragonClawAttack();
    }
    @Test
    public void getAttackNameTest(){
        assertEquals("Dragon Claw", dragonClawAttack.getAttackName());
    }

    @Test
    public void getAttackDamageTest(){
        assertEquals(22, dragonClawAttack.getAttackDamage());
    }

}
