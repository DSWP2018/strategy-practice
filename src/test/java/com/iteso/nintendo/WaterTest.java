package com.iteso.nintendo;

import com.iteso.nintendo.Type.Electric;
import com.iteso.nintendo.Type.Water;
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
    public void setDamageTest(){
        when(enemyType.getType()).thenReturn("Fire");
        Assert.assertEquals(2, water.setDamage(enemyType),0.01);
    }

    @Test
    public void setDefenseTest(){
        when(enemyType.getType()).thenReturn("Fighting");
        Assert.assertEquals(4, water.setDefense(enemyType), 0.01);
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Water", water.getType());
    }
}
