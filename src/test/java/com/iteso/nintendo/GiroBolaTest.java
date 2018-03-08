package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GiroBolaTest {

    Attack girobola;
    PokemonType type;
    PokemonCharacter character;

    @Before
    public void setUp(){
        girobola = new GiroBola();
        type = mock(PokemonType.class);
        character = mock(PokemonCharacter.class);
    }

    @Test
    public void getDamageTest(){
        Assert.assertEquals(5, girobola.getAttackDamage());
    }

    @Test
    public void attackOponentTest(){
        character.setType(type);
        when(type.setDamage(character.getType())).thenReturn((double) 2);
        Assert.assertEquals("Attack opponent with Giro bola to cause a damage of 7.0", girobola.attackOpponent(type, character));
    }

    @Test
    public void cancelAttack(){
        Assert.assertEquals("Ataque cancelado", girobola.cancelAttack());

    }

}
