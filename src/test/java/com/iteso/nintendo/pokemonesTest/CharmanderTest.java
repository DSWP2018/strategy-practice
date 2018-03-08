package com.iteso.nintendo.pokemonesTest;

import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.ataques.Attacks;
import com.iteso.nintendo.pokemones.Charmander;
import com.iteso.nintendo.tipos.PokemonType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CharmanderTest {
    PokemonCharacter charmander;
    PokemonCharacter pokemon;
    Attacks mainAttack;
    Attacks secondAttack;
    PokemonType pokemonType;

    @Before
    public void setUp(){
        mainAttack = mock(Attacks.class);
        secondAttack = mock(Attacks.class);
        pokemonType = mock(PokemonType.class);
        charmander = new Charmander();
    }

    @Test
    public void evolve(){
        Assert.assertEquals(null, charmander.evolve());
    }

    @Test
    public void getMainAttack(){
        when(mainAttack.attackName()).thenReturn("Flamethrower");
        Assert.assertEquals("Flamethrower", charmander.getMainAttack());
    }

    @Test
    public void performMainAttack(){
        when(mainAttack.attackOpponent()).thenReturn("Started fight!");
        Assert.assertEquals(mainAttack.attackOpponent()
                + " damage: "
                + mainAttack.attackDamage(), charmander.mainAttack());
    }

    @Test
    public void getSecondAttack(){
        when(secondAttack.attackName()).thenReturn("Quick Attack");
        Assert.assertEquals("Quick Attack", charmander.getSecondAttack());
    }

    @Test
    public void performSecondAttack(){
        when(secondAttack.attackOpponent()).thenReturn("Started fight!");
        Assert.assertEquals(secondAttack.attackOpponent()
                + " damage: "
                + secondAttack.attackDamage(), charmander.mainAttack());
    }

    @Test
    public void defend(){
        when(pokemonType.recievedDamage(pokemon.getType(),0.3)).thenReturn(0.3);
        when(mainAttack.attackDamage()).thenReturn(10);
    }

    @Test
    public void hasEvolution(){
        Assert.assertEquals(true, charmander.isHasEvolution());
    }

    @Test
    public void getType(){
        when(pokemonType.type()).thenReturn("Fire");
        Assert.assertEquals("Fire", charmander.getType());
    }

    @Test
    public void getName(){
        Assert.assertEquals("Charmander", charmander.getName());
    }

    @Test
    public void getDefense(){
        Assert.assertEquals(0.3, charmander.getDefenseMultiplier(), 0.1);
    }

    @Test
    public void getHitPoints(){
        Assert.assertEquals(77, charmander.getHitPoints());
    }
}