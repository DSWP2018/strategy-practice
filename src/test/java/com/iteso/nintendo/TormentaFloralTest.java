package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TormentaFloralTest {

    Attack tormentafloral;
    PokemonType type;
    PokemonCharacter character;

    @Before
    public void setUp(){
        tormentafloral = new TormentaFloral();
        type = mock(PokemonType.class);
        character = mock(PokemonCharacter.class);
    }

    @Test
    public void getDamageTest(){
        Assert.assertEquals(23, tormentafloral.getAttackDamage());
    }

    @Test
    public void attackOponentTest(){
        character.setType(type);
        when(type.setDamage(character.getType())).thenReturn((double) 2);
        Assert.assertEquals("Attack opponent with Tormenta Floral to cause a damage of 25.0", tormentafloral.attackOpponent(type, character));
    }

    @Test
    public void cancelAttack(){
        Assert.assertEquals("Ataque cancelado", tormentafloral.cancelAttack());

    }

}
