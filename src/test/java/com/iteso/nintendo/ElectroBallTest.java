package com.iteso.nintendo;

import com.iteso.nintendo.Attacks.ElectroBall;
import com.iteso.nintendo.Attacks.ThunderPunch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ElectroBallTest {
    Attack electroBall;
    PokemonCharacter character;
    PokemonType myType, enemyType;

    @Before
    public void setUp(){
        character = mock(PokemonCharacter.class, Mockito.CALLS_REAL_METHODS);
        myType = mock(PokemonType.class);
        enemyType = mock(PokemonType.class);
        electroBall = new ElectroBall();
    }

    @Test
    public void testAttackDamage(){
        Assert.assertEquals(30, electroBall.getAttackDamage());
    }

    @Test
    public void testAttackName(){
        Assert.assertEquals("electroBall", electroBall.getAttackName());
    }

    @Test
    public void testAttackOpponent(){
        character.setType(myType);
        when(myType.setDamage(character.getType())).thenReturn((double) 2);
        Assert.assertEquals("Attacking opponent with electroBall causing a damage of 32.0", electroBall.attackOpponent(myType, character));
    }
}
