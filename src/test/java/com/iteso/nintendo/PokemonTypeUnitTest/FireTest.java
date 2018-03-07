package com.iteso.nintendo.PokemonTypeUnitTest;

import com.iteso.nintendo.Definitions.PokemonType;
import com.iteso.nintendo.PokemonTypes.Fire;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FireTest {
    PokemonType fire, enemyType;

    @Before
    public void setUp(){
        fire = new Fire();
        enemyType = mock(PokemonType.class);
    }

    @Test
    public void damageAdjustmenTest(){
        when(enemyType.getType()).thenReturn("Steel");
        Assert.assertEquals(2, fire.damageAdjustment(enemyType));
    }

    @Test
    public void defenseAdjustmentTest(){
        when(enemyType.getType()).thenReturn("Water");
        Assert.assertEquals(0.4, fire.defenseAdjustment(enemyType), 0.01);
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Fire", fire.getType());
    }
}
