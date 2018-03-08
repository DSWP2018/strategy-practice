package com.iteso.nintendo;

import com.iteso.nintendo.Type.Electric;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ElectricTest {
    PokemonType electric, enemyType;

    @Before
    public void setUp(){
        electric = new Electric();
        enemyType = mock(PokemonType.class);
    }

    @Test
    public void setDamageTest(){
        when(enemyType.getType()).thenReturn("Fire");
        Assert.assertEquals(0.5, electric.setDamage(enemyType),0.01);
    }

    @Test
    public void setDefenseTest(){
        when(enemyType.getType()).thenReturn("Water");
        Assert.assertEquals(4, electric.setDefense(enemyType), 0.01);
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Electric", electric.getType());
    }
}
