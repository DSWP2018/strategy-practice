package com.iteso.nintendo;

import com.iteso.nintendo.Attacks.Tackle;
import com.iteso.nintendo.Attacks.ThunderPunch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ThunderPunchTest {
    Attack thunderPunch;
    PokemonCharacter character;
    PokemonType myType, enemyType;

    @Before
    public void setUp(){
        character = mock(PokemonCharacter.class, Mockito.CALLS_REAL_METHODS);
        myType = mock(PokemonType.class);
        enemyType = mock(PokemonType.class);
        thunderPunch = new ThunderPunch();
    }

    @Test
    public void testAttackDamage(){
        Assert.assertEquals(10, thunderPunch.getAttackDamage());
    }

    @Test
    public void testAttackName(){
        Assert.assertEquals("thunderPunch", thunderPunch.getAttackName());
    }

    @Test
    public void testAttackOpponent(){
        character.setType(myType);
        when(myType.setDamage(character.getType())).thenReturn((double) 2);
        Assert.assertEquals("Attacking opponent with thunderPunch causing a damage of 12.0", thunderPunch.attackOpponent(myType, character));
    }
}
