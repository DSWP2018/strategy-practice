package com.iteso.nintendo.AttackUnitTest;

import com.iteso.nintendo.Attacks.HojasNavaja;
import com.iteso.nintendo.Attacks.HydroPump;
import com.iteso.nintendo.Definitions.Attack;
import com.iteso.nintendo.Definitions.PokemonCharacter;
import com.iteso.nintendo.Definitions.PokemonType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HydroPumpTest {
    Attack hydroPump;
    PokemonCharacter pokeDummy;
    PokemonType myType, enemyType;

    @Before
    public void setUp(){
        pokeDummy = Mockito.mock(PokemonCharacter.class, Mockito.CALLS_REAL_METHODS);
        myType = mock(PokemonType.class);
        enemyType = mock(PokemonType.class);
        hydroPump = new HydroPump();
    }

    @Test
    public void testAttackDamage(){
        Assert.assertEquals(18, hydroPump.getAttackDamage());
    }

    @Test
    public void testAttackName(){
        Assert.assertEquals("Hydro Pump", hydroPump.getAttackName());
    }

    @Test
    public void testAttackOpponent(){
        pokeDummy.setType(myType);
        when(myType.damageAdjustment(pokeDummy.getType())).thenReturn(2);
        Assert.assertEquals("Attacking opponent with Hydro Pump causing a damage of 20", hydroPump.attackOpponent(myType, pokeDummy));
    }
}
