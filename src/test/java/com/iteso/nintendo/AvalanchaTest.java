package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AvalanchaTest {

    Attack avalancha;
    PokemonType type;
    PokemonCharacter character;

    @Before
    public void setUp(){
        avalancha = new Avalancha();
        type = mock(PokemonType.class);
        character = mock(PokemonCharacter.class);
    }

    @Test
    public void getDamageTest(){
        Assert.assertEquals(17, avalancha.getAttackDamage());
    }

    @Test
    public void attackOponentTest(){
        character.setType(type);
        when(type.setDamage(character.getType())).thenReturn((double) 2);
        Assert.assertEquals("Attack opponent with Avalancha to cause a damage of 19.0", avalancha.attackOpponent(type, character));
    }

    @Test
    public void cancelAttack(){
        Assert.assertEquals("Ataque cancelado", avalancha.cancelAttack());

    }

}
