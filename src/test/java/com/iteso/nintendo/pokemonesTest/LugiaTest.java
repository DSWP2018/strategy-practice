package com.iteso.nintendo.pokemonesTest;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.ataques.AtaqueRapido;
import com.iteso.nintendo.ataques.Attacks;
import com.iteso.nintendo.tipos.PokemonType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;

public class LugiaTest {
    Attacks quickAttack;
    PokemonCharacter lugia;
    PokemonType pokemonType;
    PokemonType enemyType;

    @Before
    public void setUp(){
        lugia = mock(PokemonCharacter.class, Mockito.CALLS_REAL_METHODS);
        pokemonType = mock(PokemonType.class);
        enemyType = mock(PokemonType.class);
        quickAttack = new AtaqueRapido();
    }

    @Test
    public void testAttackName(){
        Assert.assertEquals("Quick Attack", quickAttack.attackName());
    }

    @Test
    public void testAttackType(){
        Assert.assertEquals("Normal", quickAttack.attackType());
    }

    @Test
    public void testAttackDamage(){
        Assert.assertEquals(40, quickAttack.attackDamage());
    }

    @Test
    public void testAttackOpponent(){
        lugia.setType(pokemonType.type());
        Assert.assertEquals("Attacking opponent with Quick Attack damage: 40", quickAttack.attackOpponent()+" dmage: "+quickAttack.attackDamage());
    }
}
