package com.iteso.nintendo;

import com.iteso.nintendo.Type.Electric;
import com.iteso.nintendo.Type.Ground;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GroundTest {
    PokemonType ground, enemyType;

    @Before
    public void setUp(){
        ground = new Ground();
        enemyType = mock(PokemonType.class);
    }

    @Test
    public void setDamageTest(){
        when(enemyType.getType()).thenReturn("Fighting");
        Assert.assertEquals(0.5, ground.setDamage(enemyType),0.01);
    }

    @Test
    public void setDefenseTest(){
        when(enemyType.getType()).thenReturn("Electric");
        Assert.assertEquals(4, ground.setDefense(enemyType), 0.01);
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Ground", ground.getType());
    }
}
