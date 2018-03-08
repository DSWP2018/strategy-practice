package com.iteso.nintendo;

import com.iteso.nintendo.Pokemon.Eevee;
import com.iteso.nintendo.Pokemon.Squirtle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SquirtleTest {
    PokemonCharacter squirtle, character;
    Attack mainAttack, secondAttack;
    PokemonType type;

    @Before
    public void setUp() {
        mainAttack = mock(Attack.class);
        secondAttack = mock(Attack.class);
        type = mock(PokemonType.class);
        squirtle = new Squirtle(type, mainAttack, secondAttack);
    }

    @Test
    public void evolve() {
        Assert.assertEquals(null, squirtle.evolve());
    }

    @Test
    public void getMainAttack() {
        when(mainAttack.getAttackName()).thenReturn("Fire Breath");
        Assert.assertEquals("Fire Breath", squirtle.getMainAttack().getAttackName());
    }

    @Test
    public void performMainAttack() {
        when(mainAttack.attackOpponent(type, character)).thenReturn("Charmander Attacked!");
        Assert.assertEquals("Charmander Attacked!", squirtle.mainAttack(character));
    }

    @Test
    public void getSecondAttack() {
        when(secondAttack.getAttackName()).thenReturn("Tackle");
        Assert.assertEquals("Tackle", squirtle.getSecondAttack().getAttackName());
    }

    @Test
    public void performSecondAttack() {
        when(secondAttack.attackOpponent(type, character)).thenReturn("Charmander Attacked!");
        Assert.assertEquals("Charmander Attacked!", squirtle.secondAttack(character));
    }

    @Test
    public void defend() {
        when(type.setDefense(type)).thenReturn(0.2);
        when(mainAttack.getAttackDamage()).thenReturn(20);
        Assert.assertEquals("Defending attack, damage caused is 12 new HP is 88",
                squirtle.defend(mainAttack, type, type));
    }

    @Test
    public void hasEvolution() {
        Assert.assertEquals(true, squirtle.isHasEvolution());
    }

    @Test
    public void getType() {
        when(type.getType()).thenReturn("Fire");
        Assert.assertEquals("Fire", squirtle.getType().getType());
    }

    @Test
    public void getName() {
        Assert.assertEquals("Squirtle", squirtle.getName());
    }

    @Test
    public void getDefense() {
        Assert.assertEquals(0.4, squirtle.getDefenseMultiplier(), 0.001);
    }

    @Test
    public void getHitPoints() {
        Assert.assertEquals(100, squirtle.getHitPoints());
    }
}
