package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TerremotoTest {

    Attack terremoto;
    PokemonType type;
    PokemonCharacter character;

    @Before
    public void setUp(){
        terremoto = new Terremoto();
        type = mock(PokemonType.class);
        character = mock(PokemonCharacter.class);
    }

    @Test
    public void getDamageTest(){
        Assert.assertEquals(21, terremoto.getAttackDamage());
    }

    @Test
    public void attackOponentTest(){
        character.setType(type);
        when(type.setDamage(character.getType())).thenReturn((double) 2);
        Assert.assertEquals("Attack opponent with Terremoto to cause a damage of 23.0", terremoto.attackOpponent(type, character));
    }

    @Test
    public void cancelAttack(){
        Assert.assertEquals("Ataque cancelado", terremoto.cancelAttack());

    }

}
