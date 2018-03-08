package com.iteso.nintendo;

import com.iteso.nintendo.Attacks.Tackle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TackleTest {
    Attack tackle;
    PokemonCharacter character;
    PokemonType myType, enemyType;

    @Before
    public void setUp(){
        character = mock(PokemonCharacter.class, Mockito.CALLS_REAL_METHODS);
        myType = mock(PokemonType.class);
        enemyType = mock(PokemonType.class);
        tackle = new Tackle();
    }

    @Test
    public void testAttackDamage(){
        Assert.assertEquals(30, tackle.getAttackDamage());
    }

    @Test
    public void testAttackName(){
        Assert.assertEquals("Tackle", tackle.getAttackName());
    }

    @Test
    public void testAttackOpponent(){
        character.setType(myType);
        when(myType.setDamage(character.getType())).thenReturn((double) 2);
        Assert.assertEquals("Attacking opponent with Tackle causing a damage of 32.0", tackle.attackOpponent(myType, character));
    }
}
