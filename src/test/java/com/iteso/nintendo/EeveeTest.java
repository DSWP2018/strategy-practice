package com.iteso.nintendo;
import com.iteso.nintendo.Pokemon.Eevee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EeveeTest {
    PokemonCharacter eevee, character;
    Attack mainAttack, secondAttack;
    PokemonType type;

    @Before
    public void setUp() {
        mainAttack = mock(Attack.class);
        secondAttack = mock(Attack.class);
        type = mock(PokemonType.class);
        eevee = new Eevee(type, mainAttack, secondAttack);
    }

    @Test
    public void evolve() {
        Assert.assertEquals(null, eevee.evolve());
    }

    @Test
    public void getMainAttack() {
        when(mainAttack.getAttackName()).thenReturn("ThunderPunch");
        Assert.assertEquals("ThunderPunch", eevee.getMainAttack().getAttackName());
    }

    @Test
    public void performMainAttack() {
        when(mainAttack.attackOpponent(type, character)).thenReturn("Eevee Attacked!");
        Assert.assertEquals("Eevee Attacked!", eevee.mainAttack(character));
    }

    @Test
    public void getSecondAttack() {
        when(secondAttack.getAttackName()).thenReturn("Tackle");
        Assert.assertEquals("Tackle", eevee.getSecondAttack().getAttackName());
    }

    @Test
    public void performSecondAttack() {
        when(secondAttack.attackOpponent(type, character)).thenReturn("Eevee Attacked!");
        Assert.assertEquals("Eevee Attacked!", eevee.secondAttack(character));
    }

    @Test
    public void defend() {
        when(type.setDefense(type)).thenReturn(0.2);
        when(mainAttack.getAttackDamage()).thenReturn(20);
        Assert.assertEquals("Defending attack, damage caused is 12 new HP is 88",
                eevee.defend(mainAttack, type, type));
    }

    @Test
    public void hasEvolution() {
        Assert.assertEquals(true, eevee.isHasEvolution());
    }

    @Test
    public void getType() {
        when(type.getType()).thenReturn("Fire");
        Assert.assertEquals("Fire", eevee.getType().getType());
    }

    @Test
    public void getName() {
        Assert.assertEquals("Eevee", eevee.getName());
    }

    @Test
    public void getDefense() {
        Assert.assertEquals(0.4, eevee.getDefenseMultiplier(), 0.001);
    }

    @Test
    public void getHitPoints() {
        Assert.assertEquals(100, eevee.getHitPoints());
    }
}