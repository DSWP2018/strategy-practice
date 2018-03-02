package com.iteso.nintendo.PockemonUnitTest;

import com.iteso.nintendo.Definitions.Attack;
import com.iteso.nintendo.Definitions.PokemonCharacter;
import com.iteso.nintendo.Definitions.PokemonType;
import com.iteso.nintendo.Pokemons.Chikorita;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ChikoritaTest {
    PokemonCharacter chikorita;
    PokemonCharacter pokeDummy;
    Attack mainAttack, secondAttack;
    PokemonType pokemonType;

    @Before
    public void setUp(){
        mainAttack = mock(Attack.class);
        secondAttack = mock(Attack.class);
        pokemonType = mock(PokemonType.class);
        chikorita = new Chikorita(pokemonType, mainAttack, secondAttack);
    }

    @Test
    public void evolve(){
        Assert.assertEquals(null, chikorita.evolve());
    }

    @Test
    public void getMainAttack(){
        when(mainAttack.getAttackName()).thenReturn("Hojas Navaja");
        Assert.assertEquals("Hojas Navaja", chikorita.getMainAttack().getAttackName());
    }

    @Test
    public void performMainAttack(){
        when(mainAttack.attackOpponent(pokemonType, pokeDummy)).thenReturn("Chikorita Attacked!");
        Assert.assertEquals("Chikorita Attacked!", chikorita.mainAttack(pokeDummy));
    }

    @Test
    public void getSecondAttack(){
        when(secondAttack.getAttackName()).thenReturn("Tackle");
        Assert.assertEquals("Tackle", chikorita.getSecondAttack().getAttackName());
    }

    @Test
    public void performSecondAttack(){
        when(secondAttack.attackOpponent(pokemonType, pokeDummy)).thenReturn("Charmander Attacked!");
        Assert.assertEquals("Charmander Attacked!", chikorita.secondAttack(pokeDummy));
    }

    @Test
    public void defend(){
        when(mainAttack.getAttackDamage()).thenReturn(20);
        Assert.assertEquals("Defending attack, damage caused is 4 new HP is 46",
                chikorita.defend(mainAttack));
    }

    @Test
    public void hasEvolution(){
        Assert.assertEquals(true, chikorita.isHasEvolution());
    }

    @Test
    public void getType(){
        when(pokemonType.getType()).thenReturn("Grass");
        Assert.assertEquals("Grass", chikorita.getType().getType());
    }

    @Test
    public void getName(){
        Assert.assertEquals("Chikorita", chikorita.getName());
    }

    @Test
    public void getDefense(){
        Assert.assertEquals(0.2, chikorita.getDefenseMultiplier(), 0.001);
    }

    @Test
    public void getHitPoints(){
        Assert.assertEquals(50, chikorita.getHitPoints());
    }
}
