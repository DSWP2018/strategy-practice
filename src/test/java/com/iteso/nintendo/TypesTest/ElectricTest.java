package com.iteso.nintendo.TypesTest;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.Moves.AncientPowerAttack;
import com.iteso.nintendo.Moves.IceBeamAttack;
import com.iteso.nintendo.Pokemon.Blaziken;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Electric;
import com.iteso.nintendo.Types.Fire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by julianlz96 on 2/24/18.
 */
public class ElectricTest {

    private Electric electric;

    @Before //SetUp
    public void setUp(){
        electric = new Electric();
    }

    @Test
    public void getDefenseTypesTest(){
        assertEquals(2.0, electric.getDefenseTypes("Ground"), 0.1);

    }

    @Test
    public void getTypeName(){
        assertEquals("Electric", electric.getTypeName());
    }

}
