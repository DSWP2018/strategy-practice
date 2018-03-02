package com.iteso.nintendo.PockemonUnitTest;

import com.iteso.nintendo.Definitions.Attack;
import com.iteso.nintendo.Definitions.PokemonCharacter;
import com.iteso.nintendo.Definitions.PokemonType;
import com.iteso.nintendo.Pokemons.Torterra;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TorterraTest {
    PokemonCharacter torterra;
    PokemonCharacter pokeDummy;
    Attack mainAttack, secondAttack;
    PokemonType pokemonType;

    @Before
    public void setUp(){
        mainAttack = mock(Attack.class);
        secondAttack = mock(Attack.class);
        pokemonType = mock(PokemonType.class);
        torterra = new Torterra(pokemonType, mainAttack, secondAttack);
    }

    @Test
    public void evolve(){
        Assert.assertEquals(null, torterra.evolve());
    }

    @Test
    public void getMainAttack(){
        when(mainAttack.getAttackName()).thenReturn("Hojas Navaja");
        Assert.assertEquals("Hojas Navaja", torterra.getMainAttack().getAttackName());
    }

    @Test
    public void performMainAttack(){
        when(mainAttack.attackOpponent(pokemonType, pokeDummy)).thenReturn("Torterra Attacked!");
        Assert.assertEquals("Torterra Attacked!", torterra.mainAttack(pokeDummy));
    }

    @Test
    public void getSecondAttack(){
        when(secondAttack.getAttackName()).thenReturn("Tackle");
        Assert.assertEquals("Tackle", torterra.getSecondAttack().getAttackName());
    }

    @Test
    public void performSecondAttack(){
        when(secondAttack.attackOpponent(pokemonType, pokeDummy)).thenReturn("Torterra Attacked!");
        Assert.assertEquals("Torterra Attacked!", torterra.secondAttack(pokeDummy));
    }

    @Test
    public void defend(){
        when(mainAttack.getAttackDamage()).thenReturn(20);
        Assert.assertEquals("Defending attack, damage caused is 2 new HP is 98",
                torterra.defend(mainAttack));
    }

    @Test
    public void hasEvolution(){
        Assert.assertEquals(false, torterra.isHasEvolution());
    }

    @Test
    public void getType(){
        when(pokemonType.getType()).thenReturn("Earth");
        Assert.assertEquals("Earth", torterra.getType().getType());
    }

    @Test
    public void getName(){
        Assert.assertEquals("Torterra", torterra.getName());
    }

    @Test
    public void getDefense(){
        Assert.assertEquals(0.1, torterra.getDefenseMultiplier(), 0.001);
    }

    @Test
    public void getHitPoints(){
        Assert.assertEquals(100, torterra.getHitPoints());
    }
}
