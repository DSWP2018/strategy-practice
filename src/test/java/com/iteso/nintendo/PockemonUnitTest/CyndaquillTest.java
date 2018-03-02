package com.iteso.nintendo.PockemonUnitTest;

import com.iteso.nintendo.Definitions.Attack;
import com.iteso.nintendo.Definitions.PokemonCharacter;
import com.iteso.nintendo.Definitions.PokemonType;
import com.iteso.nintendo.Pokemons.Cyndaquill;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CyndaquillTest {
    PokemonCharacter cyndaquill;
    PokemonCharacter pokeDummy;
    Attack mainAttack, secondAttack;
    PokemonType pokemonType;

    @Before
    public void setUp(){
        mainAttack = mock(Attack.class);
        secondAttack = mock(Attack.class);
        pokemonType = mock(PokemonType.class);
        cyndaquill = new Cyndaquill(pokemonType, mainAttack, secondAttack);
    }

    @Test
    public void evolve(){
        Assert.assertEquals(null, cyndaquill.evolve());
    }

    @Test
    public void getMainAttack(){
        when(mainAttack.getAttackName()).thenReturn("Fire Breath");
        Assert.assertEquals("Fire Breath", cyndaquill.getMainAttack().getAttackName());
    }

    @Test
    public void performMainAttack(){
        when(mainAttack.attackOpponent(pokemonType, pokeDummy)).thenReturn("Cyndaquill Attacked!");
        Assert.assertEquals("Cyndaquill Attacked!", cyndaquill.mainAttack(pokeDummy));
    }

    @Test
    public void getSecondAttack(){
        when(secondAttack.getAttackName()).thenReturn("Tackle");
        Assert.assertEquals("Tackle", cyndaquill.getSecondAttack().getAttackName());
    }

    @Test
    public void performSecondAttack(){
        when(secondAttack.attackOpponent(pokemonType, pokeDummy)).thenReturn("Cyndaquill Attacked!");
        Assert.assertEquals("Cyndaquill Attacked!", cyndaquill.secondAttack(pokeDummy));
    }

    @Test
    public void defend(){
        when(mainAttack.getAttackDamage()).thenReturn(20);
        Assert.assertEquals("Defending attack, damage caused is 12 new HP is 48",
                cyndaquill.defend(mainAttack));
    }

    @Test
    public void hasEvolution(){
        Assert.assertEquals(true, cyndaquill.isHasEvolution());
    }

    @Test
    public void getType(){
        when(pokemonType.getType()).thenReturn("Fire");
        Assert.assertEquals("Fire", cyndaquill.getType().getType());
    }

    @Test
    public void getName(){
        Assert.assertEquals("Cyndaquill", cyndaquill.getName());
    }

    @Test
    public void getDefense(){
        Assert.assertEquals(0.6, cyndaquill.getDefenseMultiplier(), 0.001);
    }

    @Test
    public void getHitPoints(){
        Assert.assertEquals(60, cyndaquill.getHitPoints());
    }
}
