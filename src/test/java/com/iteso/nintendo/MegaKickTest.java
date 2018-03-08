package com.iteso.nintendo;

import com.iteso.nintendo.Attacks.MegaKick;
import com.iteso.nintendo.Attacks.ThunderPunch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MegaKickTest {
    Attack megaKick;
    PokemonCharacter character;
    PokemonType myType, enemyType;

    @Before
    public void setUp(){
        character = mock(PokemonCharacter.class, Mockito.CALLS_REAL_METHODS);
        myType = mock(PokemonType.class);
        enemyType = mock(PokemonType.class);
        megaKick = new MegaKick();
    }

    @Test
    public void testAttackDamage(){
        Assert.assertEquals(40, megaKick.getAttackDamage());
    }

    @Test
    public void testAttackName(){
        Assert.assertEquals("megaKick", megaKick.getAttackName());
    }

    @Test
    public void testAttackOpponent(){
        character.setType(myType);
        when(myType.setDamage(character.getType())).thenReturn((double) 2);
        Assert.assertEquals("Attacking opponent with megaKick causing a damage of 42.0", megaKick.attackOpponent(myType, character));
    }
}
