package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BucleArenaTest {

    Attack buclearena;
    PokemonType type;
    PokemonCharacter character;

    @Before
    public void setUp(){
        buclearena = new BucleArena();
        type = mock(PokemonType.class);
        character = mock(PokemonCharacter.class);
    }

    @Test
    public void getDamageTest(){
        Assert.assertEquals(16, buclearena.getAttackDamage());
    }

    @Test
    public void attackOponentTest(){
        character.setType(type);
        when(type.setDamage(character.getType())).thenReturn((double) 2);
        Assert.assertEquals("Attack opponent with Bucle Arena to cause a damage of 18.0", buclearena.attackOpponent(type, character));
    }

    @Test
    public void cancelAttack(){
        Assert.assertEquals("Ataque cancelado", buclearena.cancelAttack());

    }

}
