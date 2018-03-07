package com.iteso.nintendo.PokemonTypeUnitTest;

import com.iteso.nintendo.Definitions.PokemonType;
import com.iteso.nintendo.PokemonTypes.Grass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GrassTest {
    PokemonType grass, enemyType;

    @Before
    public void setUp(){
        grass = new Grass();
        enemyType = mock(PokemonType.class);
    }

    @Test
    public void damageAdjustmenTest(){
        when(enemyType.getType()).thenReturn("Fire");
        Assert.assertEquals(-4, grass.damageAdjustment(enemyType));
    }

    @Test
    public void defenseAdjustmentTest(){
        when(enemyType.getType()).thenReturn("Earth");
        Assert.assertEquals(0.4, grass.defenseAdjustment(enemyType), 0.01);
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Grass", grass.getType());
    }
}
