package com.iteso.nintendo;

import com.iteso.nintendo.Attacks.QuickAttack;
import com.iteso.nintendo.Attacks.ThunderPunch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class QuickAttackTest {
    Attack quickAttack;
    PokemonCharacter character;
    PokemonType myType, enemyType;

    @Before
    public void setUp(){
        character = mock(PokemonCharacter.class, Mockito.CALLS_REAL_METHODS);
        myType = mock(PokemonType.class);
        enemyType = mock(PokemonType.class);
        quickAttack = new QuickAttack();
    }

    @Test
    public void testAttackDamage(){
        Assert.assertEquals(25, quickAttack.getAttackDamage());
    }

    @Test
    public void testAttackName(){
        Assert.assertEquals("quickAttack", quickAttack.getAttackName());
    }

    @Test
    public void testAttackOpponent(){
        character.setType(myType);
        when(myType.setDamage(character.getType())).thenReturn((double) 2);
        Assert.assertEquals("Attacking opponent with quickAttack causing a damage of 27.0", quickAttack.attackOpponent(myType, character));
    }
}
