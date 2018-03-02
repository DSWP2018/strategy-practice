package com.iteso.nintendo.AttackUnitTest;

import com.iteso.nintendo.Attacks.FireBreath;
import com.iteso.nintendo.Definitions.Attack;
import com.iteso.nintendo.Definitions.PokemonCharacter;
import com.iteso.nintendo.Definitions.PokemonType;
import com.iteso.nintendo.PokemonTypes.Fire;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FireBreathTest {
    Attack fireBreath;
    PokemonCharacter pokeDummy;
    PokemonType myType, enemyType;

    @Before
    public void setUp(){
        pokeDummy = Mockito.mock(PokemonCharacter.class, Mockito.CALLS_REAL_METHODS);
        myType = mock(PokemonType.class);
        enemyType = mock(PokemonType.class);
        fireBreath = new FireBreath();
    }

    @Test
    public void testAttackDamage(){
        Assert.assertEquals(15, fireBreath.getAttackDamage());
    }

    @Test
    public void testAttackName(){
        Assert.assertEquals("Fire Breath", fireBreath.getAttackName());
    }

    @Test
    public void testAttackOpponent(){
        pokeDummy.setType(myType);
        when(myType.damageAdjustment(pokeDummy.getType())).thenReturn(2);
        Assert.assertEquals("Attacking opponent with Fire Breath causing a damage of 17", fireBreath.attackOpponent(myType, pokeDummy));
    }
}
