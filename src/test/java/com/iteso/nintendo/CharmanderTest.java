package com.iteso.nintendo;

import com.iteso.nintendo.Pokemon.Charmander;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CharmanderTest {
    PokemonCharacter charmander, character;
    Attack mainAttack, secondAttack;
    PokemonType type;

    @Before
    public void setUp(){
        mainAttack = mock(Attack.class);
        secondAttack = mock(Attack.class);
        type = mock(PokemonType.class);
        charmander = new Charmander(type, mainAttack, secondAttack);
    }

    @Test
    public void evolve(){
        Assert.assertEquals(null, charmander.evolve());
    }

    @Test
    public void getMainAttack(){
        when(mainAttack.getAttackName()).thenReturn("quickAttack");
        Assert.assertEquals("quickAttack", charmander.getMainAttack().getAttackName());
    }

    @Test
    public void performMainAttack(){
        when(mainAttack.attackOpponent(type, character)).thenReturn("Charmander Attacked!");
        Assert.assertEquals("Charmander Attacked!", charmander.mainAttack(character));
    }

    @Test
    public void getSecondAttack(){
        when(secondAttack.getAttackName()).thenReturn("Tackle");
        Assert.assertEquals("Tackle", charmander.getSecondAttack().getAttackName());
    }

    @Test
    public void performSecondAttack(){
        when(secondAttack.attackOpponent(type, character)).thenReturn("Charmander Attacked!");
        Assert.assertEquals("Charmander Attacked!", charmander.secondAttack(character));
    }

    @Test
    public void defend(){
        when(type.setDefense(type)).thenReturn(0.2);
        when(mainAttack.getAttackDamage()).thenReturn(20);
        Assert.assertEquals("Defending attack, damage caused is 12 new HP is 88",
                charmander.defend(mainAttack, type, type));
    }

    @Test
    public void hasEvolution(){
        Assert.assertEquals(true, charmander.isHasEvolution());
    }

    @Test
    public void getType(){
        when(type.getType()).thenReturn("Fire");
        Assert.assertEquals("Fire", charmander.getType().getType());
    }

    @Test
    public void getName(){
        Assert.assertEquals("Charmander", charmander.getName());
    }

    @Test
    public void getDefense(){
        Assert.assertEquals(0.4, charmander.getDefenseMultiplier(), 0.001);
    }

    @Test
    public void getHitPoints(){
        Assert.assertEquals(100, charmander.getHitPoints());
    }
}
