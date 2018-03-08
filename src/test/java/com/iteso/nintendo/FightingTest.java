package com.iteso.nintendo;

import com.iteso.nintendo.Type.Electric;
import com.iteso.nintendo.Type.Fighting;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FightingTest {
    PokemonType fighting, enemyType;

    @Before
    public void setUp(){
        fighting = new Fighting();
        enemyType = mock(PokemonType.class);
    }

    @Test
    public void setDamageTest(){
        when(enemyType.getType()).thenReturn("Ground");
        Assert.assertEquals(2, fighting.setDamage(enemyType),0.01);
    }

    @Test
    public void setDefenseTest(){
        when(enemyType.getType()).thenReturn("Water");
        Assert.assertEquals(4, fighting.setDefense(enemyType), 0.01);
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Fighting", fighting.getType());
    }
}
