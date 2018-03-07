package com.iteso.nintendo.AttackUnitTest;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.attacks.FlashCannon;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.types.PokemonType;
import com.iteso.nintendo.types.Steel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FlashCannonUT {
    Attack flashCannon;
    PokemonCharacter decoy;
    PokemonType myType, enemyType;

    @Before
    public void setUp(){
        decoy = Mockito.mock(PokemonCharacter.class, Mockito.CALLS_REAL_METHODS);
        myType = mock(PokemonType.class);
        enemyType = mock(PokemonType.class);
        flashCannon = new FlashCannon();
    }

    @Test
    public void testAttackDamage(){
        Assert.assertEquals(80, FlashCannon.getAttackDamage());
    }

    @Test
    public void testAttackName(){
        Assert.assertEquals("Flash Cannon", FlashCannon.getAttackName());
    }

    @Test
    public void testAttackOpponent(){
        decoy.setType(myType);
        when(myType.damageAdjustment(decoy.getType())).thenReturn(2);
        Assert.assertEquals("Attacking opponent with Fire Breath causing a damage of 17", flashCannon.attackOpponent(myType, decoy));
    }
}