package com.iteso.nintendo.TypeUnitTest;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.types.PokemonType;
import com.iteso.nintendo.types.Steel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SteelUT {
    PokemonType steel;
    Attack attackType;

    @Before
    public void setUp(){
        steel = new Steel();
        attackType = mock(Attack.class);
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Steel", steel.type());
    }
}