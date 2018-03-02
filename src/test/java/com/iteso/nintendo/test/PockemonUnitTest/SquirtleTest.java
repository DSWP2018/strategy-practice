package com.iteso.nintendo.test.PockemonUnitTest;

import com.iteso.nintendo.Definitions.Attack;
import com.iteso.nintendo.Definitions.PokemonCharacter;
import com.iteso.nintendo.Definitions.PokemonType;
import com.iteso.nintendo.Pokemons.Squirtle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SquirtleTest {
    PokemonCharacter squirtle;
    PokemonCharacter pokeDummy;
    Attack mainAttack, secondAttack;
    PokemonType pokemonType;

    @Before
    public void setUp(){
        mainAttack = mock(Attack.class);
        secondAttack = mock(Attack.class);
        pokemonType = mock(PokemonType.class);
        squirtle = new Squirtle(pokemonType, mainAttack, secondAttack);
    }

    @Test
    public void evolve(){
        Assert.assertEquals(null, squirtle.evolve());
    }

    @Test
    public void getMainAttack(){
        when(mainAttack.getAttackName()).thenReturn("Hydro Pump");
        Assert.assertEquals("Hydro Pump", squirtle.getMainAttack().getAttackName());
    }

    @Test
    public void performMainAttack(){
        when(mainAttack.attackOpponent(pokemonType, pokeDummy)).thenReturn("Squirtle Attacked!");
        Assert.assertEquals("Squirtle Attacked!", squirtle.mainAttack(pokeDummy));
    }

    @Test
    public void getSecondAttack(){
        when(secondAttack.getAttackName()).thenReturn("Tackle");
        Assert.assertEquals("Tackle", squirtle.getSecondAttack().getAttackName());
    }

    @Test
    public void performSecondAttack(){
        when(secondAttack.attackOpponent(pokemonType, pokeDummy)).thenReturn("Squirtle Attacked!");
        Assert.assertEquals("Squirtle Attacked!", squirtle.secondAttack(pokeDummy));
    }

    @Test
    public void defend(){
        when(mainAttack.getAttackDamage()).thenReturn(20);
        Assert.assertEquals("Defending attack, damage caused is 8 new HP is 92",
                squirtle.defend(mainAttack));
    }

    @Test
    public void hasEvolution(){
        Assert.assertEquals(true, squirtle.isHasEvolution());
    }

    @Test
    public void getType(){
        when(pokemonType.getType()).thenReturn("Water");
        Assert.assertEquals("Water", squirtle.getType().getType());
    }

    @Test
    public void getName(){
        Assert.assertEquals("Squirtle", squirtle.getName());
    }

    @Test
    public void getDefense(){
        Assert.assertEquals(0.4, squirtle.getDefenseMultiplier(), 0.001);
    }

    @Test
    public void getHitPoints(){
        Assert.assertEquals(100, squirtle.getHitPoints());
    }
}
