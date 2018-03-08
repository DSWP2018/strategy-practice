package com.iteso.nintendo;

import com.iteso.nintendo.Type.Electric;
import com.iteso.nintendo.Type.Fire;
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
    public void setDamageTest(){
        when(enemyType.getType()).thenReturn("Water");
        Assert.assertEquals(0.5, fire.setDamage(enemyType),0.01);
    }

    @Test
    public void setDefenseTest(){
        when(enemyType.getType()).thenReturn("Ground");
        Assert.assertEquals(0.5, fire.setDefense(enemyType), 0.01);
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Fire", fire.getType());
    }
}
