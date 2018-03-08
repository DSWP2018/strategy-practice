package com.iteso.nintendo.PokemonUnitTest;

import com.iteso.nintendo.attacks.Attack;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.types.PokemonType;
import com.iteso.nintendo.pokemons.Jirachi;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class JirachiUT {
    Jirachi jirachi;
    PokemonCharacter decoy;
    Attack mainAttack, secondAttack;
    PokemonType pokemonType;

    @Before
    public void setUp(){
        mainAttack = mock(Attack.class);
        secondAttack = mock(Attack.class);
        pokemonType = mock(PokemonType.class);
        jirachi = new Jirachi(pokemonType, mainAttack, secondAttack);
    }

    @Test
    public void evolve(){
        Assert.assertEquals(null, jirachi.evolve());
    }

    @Test
    public void getMainAttack(){
        when(mainAttack.attackName()).thenReturn("Flash Cannon");
        Assert.assertEquals("Flash Cannon", jirachi.getMainAttack().getAttackName());
    }

    @Test
    public void performMainAttack(){
        when(mainAttack.attackOpponent()).thenReturn("Jirachi performed an attack!");
        Assert.assertEquals("Jirachi performed an attack!", jirachi.getMainAttack());
    }

    @Test
    public void getSecondAttack(){
        when(secondAttack.attackName()).thenReturn("Zen Headbut");
        Assert.assertEquals("Zen Headbutt", jirachi.getSecondAttack().getAttackName());
    }

    @Test
    public void defend(){

    }

    @Test
    public void getType(){
        Assert.assertEquals("Steel", jirachi.getType());
    }

    @Test
    public void getName(){
        Assert.assertEquals("Jirachi", jirachi.getName());
    }

    @Test
    public void getDefense(){
        Assert.assertEquals(0.20, jirachi.getDefense(), 0.001);
    }
}