package com.iteso.nintendo.PokemonTypeUnitTest;

import com.iteso.nintendo.Definitions.PokemonType;
import com.iteso.nintendo.PokemonTypes.Water;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WaterTest {
    PokemonType water, enemyType;

    @Before
    public void setUp(){
        water = new Water();
        enemyType = mock(PokemonType.class);
    }

    @Test
    public void damageAdjustmenTest(){
        when(enemyType.getType()).thenReturn("Grass");
        Assert.assertEquals(-4, water.damageAdjustment(enemyType));
    }

    @Test
    public void defenseAdjustmentTest(){
        when(enemyType.getType()).thenReturn("Fire");
        Assert.assertEquals(0.4, water.defenseAdjustment(enemyType), 0.01);
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Water", water.getType());
    }
}
