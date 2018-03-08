package com.iteso.nintendo;

import com.iteso.nintendo.Pokemon.Pikachu;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Created by rvillalobos on 2/24/18.
 */
public class PikachuTest {
    PokemonCharacter pikachu, character;
    Attack mainAttack, secondAttack;
    PokemonType type;

    @Before
    public void setUp(){
        mainAttack = mock(Attack.class);
        secondAttack = mock(Attack.class);
        type = mock(PokemonType.class);
        pikachu = new Pikachu(type, mainAttack, secondAttack);
    }

    @Test
    public void evolve(){
        Assert.assertEquals(null, pikachu.evolve());
    }

    @Test
    public void getMainAttack(){
        when(mainAttack.getAttackName()).thenReturn("ElectroBall");
        Assert.assertEquals("ElectroBall", pikachu.getMainAttack().getAttackName());
    }

    @Test
    public void performMainAttack(){
        when(mainAttack.attackOpponent(type, character)).thenReturn("Pikachu Attacked!");
        Assert.assertEquals("Pikachu Attacked!", pikachu.mainAttack(character));
    }

    @Test
    public void getSecondAttack(){
        when(secondAttack.getAttackName()).thenReturn("Tackle");
        Assert.assertEquals("Tackle", pikachu.getSecondAttack().getAttackName());
    }

    @Test
    public void performSecondAttack(){
        when(secondAttack.attackOpponent(type, character)).thenReturn("Pikachu Attacked!");
        Assert.assertEquals("Pikachu Attacked!", pikachu.secondAttack(character));
    }

    @Test
    public void defend(){
        when(type.setDefense(type)).thenReturn(0.2);
        when(mainAttack.getAttackDamage()).thenReturn(20);
        Assert.assertEquals("Defending attack, damage caused is 12 new HP is 88",
                pikachu.defend(mainAttack, type, type));
    }

    @Test
    public void hasEvolution(){
        Assert.assertEquals(true, pikachu.isHasEvolution());
    }

    @Test
    public void getType(){
        when(type.getType()).thenReturn("Electric");
        Assert.assertEquals("Electric", pikachu.getType().getType());
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
