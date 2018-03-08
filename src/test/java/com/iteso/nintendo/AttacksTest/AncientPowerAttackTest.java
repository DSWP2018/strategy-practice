package com.iteso.nintendo.AttacksTest;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.Moves.AncientPowerAttack;
import com.iteso.nintendo.Moves.IceBeamAttack;
import com.iteso.nintendo.Pokemon.Blaziken;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Fire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by julianlz96 on 2/24/18.
 */
public class AncientPowerAttackTest {

    private AncientPowerAttack ancientPowerAttack;

    @Before
    public void setUp(){
        ancientPowerAttack = new AncientPowerAttack();
    }
    @Test
    public void getAttackNameTest(){
        assertEquals("Ancient Power", ancientPowerAttack.getAttackName());
    }

    @Test
    public void getAttackDamageTest(){
        assertEquals(17, ancientPowerAttack.getAttackDamage());
    }

}
