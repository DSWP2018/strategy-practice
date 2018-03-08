package com.iteso.nintendo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BlastoiseTest {
    PokemonCharacter blastoise, character;
    Attack mainAttack, secondAttack;
    PokemonType type;

    @Before
    public void setUp(){
        mainAttack = mock(Attack.class);
        secondAttack = mock(Attack.class);
        type = mock(PokemonType.class);
        blastoise = new com.iteso.nintendo.Pokemon.Blastoise(type,mainAttack,secondAttack);
    }

    @Test
    public void evolve(){
        Assert.assertEquals(null, blastoise.evolve());
    }

    @Test
    public void getMainAttack(){
        when(mainAttack.getAttackName()).thenReturn("MegaKick");
        Assert.assertEquals("MegaKick", blastoise.getMainAttack().getAttackName());
    }

    @Test
    public void performMainAttack(){
        when(mainAttack.attackOpponent(type, character)).thenReturn("Blastoise Attacked!");
        Assert.assertEquals("Blastoise Attacked!", blastoise.mainAttack(character));
    }

    @Test
    public void getSecondAttack(){
        when(secondAttack.getAttackName()).thenReturn("Tackle");
        Assert.assertEquals("Tackle", blastoise.getSecondAttack().getAttackName());
    }

    @Test
    public void performSecondAttack(){
        when(secondAttack.attackOpponent(type, character)).thenReturn("Blastoise Attacked!");
        Assert.assertEquals("Blastoise Attacked!", blastoise.secondAttack(character));
    }

    @Test
    public void defend(){
        when(type.setDefense(type)).thenReturn(0.2);
        when(mainAttack.getAttackDamage()).thenReturn(20);
        Assert.assertEquals("Defending attack, damage caused is 12 new HP is 88",
                blastoise.defend(mainAttack, type, type));
    }

    @Test
    public void hasEvolution(){
        Assert.assertEquals(true, blastoise.isHasEvolution());
    }

    @Test
    public void getType(){
        when(type.getType()).thenReturn("Fighting");
        Assert.assertEquals("Fighting", blastoise.getType().getType());
    }

    @Test
    public void getName(){
        Assert.assertEquals("Blastoise", blastoise.getName());
    }

    @Test
    public void getDefense(){
        Assert.assertEquals(0.4, blastoise.getDefenseMultiplier(), 0.01);
    }

    @Test
    public void getHitPoints(){
        Assert.assertEquals(100, blastoise.getHitPoints());
    }
}
