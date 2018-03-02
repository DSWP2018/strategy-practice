package com.iteso.nintendo.AttackUnitTest;

import com.iteso.nintendo.Attacks.HojasNavaja;
import com.iteso.nintendo.Definitions.Attack;
import com.iteso.nintendo.Definitions.PokemonCharacter;
import com.iteso.nintendo.Definitions.PokemonType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HojasNavajaTest {
    Attack hojasNavaja;
    PokemonCharacter pokeDummy;
    PokemonType myType, enemyType;

    @Before
    public void setUp(){
        pokeDummy = Mockito.mock(PokemonCharacter.class, Mockito.CALLS_REAL_METHODS);
        myType = mock(PokemonType.class);
        enemyType = mock(PokemonType.class);
        hojasNavaja = new HojasNavaja();
    }

    @Test
    public void testAttackDamage(){
        Assert.assertEquals(10, hojasNavaja.getAttackDamage());
    }

    @Test
    public void testAttackName(){
        Assert.assertEquals("Hojas Navaja", hojasNavaja.getAttackName());
    }

    @Test
    public void testAttackOpponent(){
        pokeDummy.setType(myType);
        when(myType.damageAdjustment(pokeDummy.getType())).thenReturn(2);
        Assert.assertEquals("Attacking opponent with Hojas Navaja causing a damage of 12", hojasNavaja.attackOpponent(myType, pokeDummy));
    }
}
