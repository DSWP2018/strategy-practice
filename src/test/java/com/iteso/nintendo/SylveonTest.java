package com.iteso.nintendo;

import com.iteso.nintendo.Pokemon.Eevee;
import com.iteso.nintendo.Pokemon.Sylveon;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SylveonTest {
    PokemonCharacter sylveon, character;
    Attack mainAttack, secondAttack;
    PokemonType type;

    @Before
    public void setUp() {
        mainAttack = mock(Attack.class);
        secondAttack = mock(Attack.class);
        type = mock(PokemonType.class);
        sylveon = new Sylveon(type, mainAttack, secondAttack);
    }

    @Test
    public void evolve() {
        Assert.assertEquals(null, sylveon.evolve());
    }

    @Test
    public void getMainAttack() {
        when(mainAttack.getAttackName()).thenReturn("QuickAttack");
        Assert.assertEquals("QuickAttack", sylveon.getMainAttack().getAttackName());
    }

    @Test
    public void performMainAttack() {
        when(mainAttack.attackOpponent(type, character)).thenReturn("Sylveon Attacked!");
        Assert.assertEquals("Sylveon Attacked!", sylveon.mainAttack(character));
    }

    @Test
    public void getSecondAttack() {
        when(secondAttack.getAttackName()).thenReturn("Tackle");
        Assert.assertEquals("Tackle", sylveon.getSecondAttack().getAttackName());
    }

    @Test
    public void performSecondAttack() {
        when(secondAttack.attackOpponent(type, character)).thenReturn("Sylveon Attacked!");
        Assert.assertEquals("Sylveon Attacked!", sylveon.secondAttack(character));
    }

    @Test
    public void defend() {
        when(type.setDefense(type)).thenReturn(0.2);
        when(mainAttack.getAttackDamage()).thenReturn(20);
        Assert.assertEquals("Defending attack, damage caused is 12 new HP is 88",
                sylveon.defend(mainAttack, type, type));
    }

    @Test
    public void hasEvolution() {
        Assert.assertEquals(true, sylveon.isHasEvolution());
    }

    @Test
    public void getType() {
        when(type.getType()).thenReturn("Fire");
        Assert.assertEquals("Fire", sylveon.getType().getType());
    }

    @Test
    public void getName() {
        Assert.assertEquals("Sylveon", sylveon.getName());
    }

    @Test
    public void getDefense() {
        Assert.assertEquals(0.4, sylveon.getDefenseMultiplier(), 0.001);
    }

    @Test
    public void getHitPoints() {
        Assert.assertEquals(100, sylveon.getHitPoints());
    }
}
