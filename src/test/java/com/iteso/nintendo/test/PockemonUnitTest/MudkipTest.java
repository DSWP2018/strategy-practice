package com.iteso.nintendo.test.PockemonUnitTest;

import com.iteso.nintendo.Definitions.Attack;
import com.iteso.nintendo.Definitions.PokemonCharacter;
import com.iteso.nintendo.Definitions.PokemonType;
import com.iteso.nintendo.Pokemons.Mudkip;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MudkipTest {
    PokemonCharacter mudkip;
    PokemonCharacter pokeDummy;
    Attack mainAttack, secondAttack;
    PokemonType pokemonType;

    @Before
    public void setUp(){
        mainAttack = mock(Attack.class);
        secondAttack = mock(Attack.class);
        pokemonType = mock(PokemonType.class);
        mudkip = new Mudkip(pokemonType, mainAttack, secondAttack);
    }

    @Test
    public void evolve(){
        Assert.assertEquals(null, mudkip.evolve());
    }

    @Test
    public void getMainAttack(){
        when(mainAttack.getAttackName()).thenReturn("Hydro Pump");
        Assert.assertEquals("Hydro Pump", mudkip.getMainAttack().getAttackName());
    }

    @Test
    public void performMainAttack(){
        when(mainAttack.attackOpponent(pokemonType, pokeDummy)).thenReturn("Mudkip Attacked!");
        Assert.assertEquals("Mudkip Attacked!", mudkip.mainAttack(pokeDummy));
    }

    @Test
    public void getSecondAttack(){
        when(secondAttack.getAttackName()).thenReturn("Tackle");
        Assert.assertEquals("Tackle", mudkip.getSecondAttack().getAttackName());
    }

    @Test
    public void performSecondAttack(){
        when(secondAttack.attackOpponent(pokemonType, pokeDummy)).thenReturn("Mudkip Attacked!");
        Assert.assertEquals("Mudkip Attacked!", mudkip.secondAttack(pokeDummy));
    }

    @Test
    public void defend(){
        when(mainAttack.getAttackDamage()).thenReturn(20);
        Assert.assertEquals("Defending attack, damage caused is 8 new HP is 82",
                mudkip.defend(mainAttack));
    }

    @Test
    public void hasEvolution(){
        Assert.assertEquals(true, mudkip.isHasEvolution());
    }

    @Test
    public void getType(){
        when(pokemonType.getType()).thenReturn("Water");
        Assert.assertEquals("Water", mudkip.getType().getType());
    }

    @Test
    public void getName(){
        Assert.assertEquals("Mudkip", mudkip.getName());
    }

    @Test
    public void getDefense(){
        Assert.assertEquals(0.4, mudkip.getDefenseMultiplier(), 0.001);
    }

    @Test
    public void getHitPoints(){
        Assert.assertEquals(90, mudkip.getHitPoints());
    }
}
