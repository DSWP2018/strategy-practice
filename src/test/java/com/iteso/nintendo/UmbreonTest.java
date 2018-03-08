package com.iteso.nintendo;

import com.iteso.nintendo.Pokemon.Eevee;
import com.iteso.nintendo.Pokemon.Umbreon;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UmbreonTest {
    PokemonCharacter umbreon, character;
    Attack mainAttack, secondAttack;
    PokemonType type;

    @Before
    public void setUp() {
        mainAttack = mock(Attack.class);
        secondAttack = mock(Attack.class);
        type = mock(PokemonType.class);
        umbreon = new Umbreon(type, mainAttack, secondAttack);
    }

    @Test
    public void evolve() {
        Assert.assertEquals(null, umbreon.evolve());
    }

    @Test
    public void getMainAttack() {
        when(mainAttack.getAttackName()).thenReturn("ThunderPunch");
        Assert.assertEquals("ThunderPunch", umbreon.getMainAttack().getAttackName());
    }

    @Test
    public void performMainAttack() {
        when(mainAttack.attackOpponent(type, character)).thenReturn("Umbreon Attacked!");
        Assert.assertEquals("Umbreon Attacked!", umbreon.mainAttack(character));
    }

    @Test
    public void getSecondAttack() {
        when(secondAttack.getAttackName()).thenReturn("Tackle");
        Assert.assertEquals("Tackle", umbreon.getSecondAttack().getAttackName());
    }

    @Test
    public void performSecondAttack() {
        when(secondAttack.attackOpponent(type, character)).thenReturn("Umbreon Attacked!");
        Assert.assertEquals("Umbreon Attacked!", umbreon.secondAttack(character));
    }

    @Test
    public void defend() {
        when(type.setDefense(type)).thenReturn(0.2);
        when(mainAttack.getAttackDamage()).thenReturn(20);
        Assert.assertEquals("Defending attack, damage caused is 10 new HP is 67",
                umbreon.defend(mainAttack, type, type));
    }

    @Test
    public void hasEvolution() {
        Assert.assertEquals(true, umbreon.isHasEvolution());
    }

    @Test
    public void getType() {
        when(type.getType()).thenReturn("Fire");
        Assert.assertEquals("Fire", umbreon.getType().getType());
    }

    @Test
    public void getName() {
        Assert.assertEquals("Umbreon", umbreon.getName());
    }

    @Test
    public void getDefense() {
        Assert.assertEquals(0.3, umbreon.getDefenseMultiplier(), 0.001);
    }

    @Test
    public void getHitPoints() {
        Assert.assertEquals(77, umbreon.getHitPoints());
    }
}
