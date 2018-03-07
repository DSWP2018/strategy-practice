package com.iteso.nintendo.PokemonTypeUnitTest;

import com.iteso.nintendo.Definitions.PokemonType;
import com.iteso.nintendo.PokemonTypes.Earth;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EarthTest {
    PokemonType earth, enemyType;

    @Before
    public void setUp(){
        earth = new Earth();
        enemyType = mock(PokemonType.class);
    }

    @Test
    public void damageAdjustmenTest(){
        when(enemyType.getType()).thenReturn("Water");
        Assert.assertEquals(2, earth.damageAdjustment(enemyType));
    }

    @Test
    public void defenseAdjustmentTest(){
        when(enemyType.getType()).thenReturn("Fire");
        Assert.assertEquals(0.4, earth.defenseAdjustment(enemyType), 0.01);
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Earth", earth.getType());
    }
}
