package com.iteso.nintendo.PockemonUnitTest;

import com.iteso.nintendo.Definitions.Attack;
import com.iteso.nintendo.Definitions.PokemonCharacter;
import com.iteso.nintendo.Definitions.PokemonType;
import com.iteso.nintendo.Pokemons.Pikachu;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PikachuTest {
    PokemonCharacter pikachu;
    PokemonCharacter pokeDummy;
    Attack mainAttack, secondAttack;
    PokemonType pokemonType;

    @Before
    public void setUp(){
        mainAttack = mock(Attack.class);
        secondAttack = mock(Attack.class);
        pokemonType = mock(PokemonType.class);
        pikachu = new Pikachu(pokemonType, mainAttack, secondAttack);
    }

    @Test
    public void evolve(){
        Assert.assertEquals(null, pikachu.evolve());
    }

    @Test
    public void getMainAttack(){
        when(mainAttack.getAttackName()).thenReturn("Impaktrueno");
        Assert.assertEquals("Impaktrueno", pikachu.getMainAttack().getAttackName());
    }

    @Test
    public void performMainAttack(){
        when(mainAttack.attackOpponent(pokemonType, pokeDummy)).thenReturn("Pikachu Attacked!");
        Assert.assertEquals("Pikachu Attacked!", pikachu.mainAttack(pokeDummy));
    }

    @Test
    public void getSecondAttack(){
        when(secondAttack.getAttackName()).thenReturn("Tackle");
        Assert.assertEquals("Tackle", pikachu.getSecondAttack().getAttackName());
    }

    @Test
    public void performSecondAttack(){
        when(secondAttack.attackOpponent(pokemonType, pokeDummy)).thenReturn("Pikachu Attacked!");
        Assert.assertEquals("Pikachu Attacked!", pikachu.secondAttack(pokeDummy));
    }

    @Test
    public void defend(){
        when(mainAttack.getAttackDamage()).thenReturn(20);
        Assert.assertEquals("Defending attack, damage caused is 8 new HP is 92",
                pikachu.defend(mainAttack));
    }

    @Test
    public void hasEvolution(){
        Assert.assertEquals(true, pikachu.isHasEvolution());
    }

    @Test
    public void getType(){
        when(pokemonType.getType()).thenReturn("Steel");
        Assert.assertEquals("Steel", pikachu.getType().getType());
    }

    @Test
    public void getName(){
        Assert.assertEquals("Pikachu", pikachu.getName());
    }

    @Test
    public void getDefense(){
        Assert.assertEquals(0.4, pikachu.getDefenseMultiplier(), 0.01);
    }

    @Test
    public void getHitPoints(){
        Assert.assertEquals(100, pikachu.getHitPoints());
    }
}
