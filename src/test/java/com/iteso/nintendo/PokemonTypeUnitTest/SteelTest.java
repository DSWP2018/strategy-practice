package com.iteso.nintendo.PokemonTypeUnitTest;

import com.iteso.nintendo.Definitions.PokemonType;
import com.iteso.nintendo.PokemonTypes.Steel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SteelTest {
    PokemonType steel, enemyType;

    @Before
    public void setUp(){
        steel = new Steel();
        enemyType = mock(PokemonType.class);
    }

    @Test
    public void damageAdjustmenTest(){
        when(enemyType.getType()).thenReturn("Fire");
        Assert.assertEquals(2, steel.damageAdjustment(enemyType));
    }

    @Test
    public void defenseAdjustmentTest(){
        when(enemyType.getType()).thenReturn("Earth");
        Assert.assertEquals(-0.2, steel.defenseAdjustment(enemyType), 0.01);
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Steel", steel.getType());
    }
}
