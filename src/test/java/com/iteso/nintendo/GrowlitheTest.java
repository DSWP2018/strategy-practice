package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class GrowlitheTest {
    Growlithe growlithe;
    Attack mockedAttack;

    Scratch mockedScratch;
    Tackle mockedEmber;


    @Before
    public void setUp(){
        growlithe = new Growlithe();

        mockedAttack = mock(Ember.class);

        mockedScratch = mock(Scratch.class);
        mockedEmber = mock(Tackle.class);

    }

    @Test
    public void evolve(){
        assertEquals(null, growlithe.evolve());
    }

    @Test
    public void isSupperEffective() {
        when(mockedAttack.getAttackType()).thenReturn("ground");
        when(mockedAttack.getAttackDamage()).thenReturn(12);
        when(mockedAttack.getAttackName()).thenReturn("Ember");

        assertEquals("Defending attack, damage caused is 14 new HP is 56", growlithe.defend(mockedAttack));

    }

    @Test
    public void isNotEffective() {
        when(mockedAttack.getAttackType()).thenReturn("ice");
        when(mockedAttack.getAttackDamage()).thenReturn(16);
        when(mockedAttack.getAttackName()).thenReturn("Sparks");

        assertEquals("Defending attack, damage caused is 4 new HP is 66", growlithe.defend(mockedAttack));

    }

    @Test
    public void isNeutral() {
        when(mockedAttack.getAttackType()).thenReturn("normal");
        when(mockedAttack.getAttackDamage()).thenReturn(7);
        when(mockedAttack.getAttackName()).thenReturn("Scratch");

        assertEquals("Defending attack, damage caused is 4 new HP is 66", growlithe.defend(mockedAttack));
    }

    @Test
    public void performMainAttack() {
        when(mockedScratch.getAttackDamage()).thenReturn(7);
        when(mockedScratch.getAttackName()).thenReturn("Scratch");

        assertEquals(" ataca con SCRATCH intentando hacer "
                + growlithe.getMainAttack().getAttackDamage() +
                " de daño!", growlithe.mainAttack());
    }

    @Test
    public void performSecondAttack() {
        when(mockedEmber.getAttackDamage()).thenReturn(12);
        when(mockedEmber.getAttackName()).thenReturn("Ember");

        assertEquals(" ataca con EMBER intentando hacer "
         + growlithe.getSecondAttack().getAttackDamage() +
                " de daño!", growlithe.secondAttack());
    }



}
