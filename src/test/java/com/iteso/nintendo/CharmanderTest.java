package com.iteso.nintendo;

import com.iteso.nintendo.Definitions.Attack;
import com.iteso.nintendo.Definitions.PokemonCharacter;
import com.iteso.nintendo.Definitions.PokemonType;
import com.iteso.nintendo.Pokemons.Charmander;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CharmanderTest {
    Charmander charmander;
    PokemonCharacter pokeDummy;
    Attack mainAttack, secondAttack;
    PokemonType pokemonType;

    @Before
    public void setUp(){
        mainAttack = mock(Attack.class);
        secondAttack = mock(Attack.class);
        pokemonType = mock(PokemonType.class);
        charmander = new Charmander(pokemonType, mainAttack, secondAttack);
    }

    @Test
    public void evolve(){
        Assert.assertEquals(null, charmander.evolve());
    }

    @Test
    public void getMainAttack(){
        when(mainAttack.getAttackName()).thenReturn("Fire Breath");
        Assert.assertEquals("Fire Breath", charmander.getMainAttack().getAttackName());
    }

    @Test
    public void performMainAttack(){
        when(mainAttack.attackOpponent(pokemonType, pokeDummy)).thenReturn("Charmander Attacked!");
        Assert.assertEquals("Charmander Attacked!", charmander.mainAttack(pokeDummy));
    }

    @Test
    public void getSecondAttack(){
        when(secondAttack.getAttackName()).thenReturn("Tackle");
        Assert.assertEquals("Tackle", charmander.getSecondAttack().getAttackName());
    }

    @Test
    public void performSecondAttack(){
        when(secondAttack.attackOpponent(pokemonType, pokeDummy)).thenReturn("Charmander Attacked!");
        Assert.assertEquals("Charmander Attacked!", charmander.secondAttack(pokeDummy));
    }

    @Test
    public void defend(){
        when(mainAttack.getAttackDamage()).thenReturn(20);
        Assert.assertEquals("Defending attack, damage caused is 6 new HP is 71",
                charmander.defend(mainAttack));
    }

    @Test
    public void hasEvolution(){
        charmander.setHasEvolution(false);
        Assert.assertEquals(false, charmander.isHasEvolution());
    }

    @Test
    public void getType(){
        when(pokemonType.getType()).thenReturn("Fire");
        Assert.assertEquals("Fire", charmander.getType().getType());
    }

    @Test
    public void getName(){
        Assert.assertEquals("Charmander", charmander.getName());
    }

    @Test
    public void getDefense(){
        Assert.assertEquals(0.3, 0.0, charmander.getDefenseMultiplier());
    }

    @Test
    public void getHitPoints(){
        Assert.assertEquals(77, charmander.getHitPoints());
    }
}
