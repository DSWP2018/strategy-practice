package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class VictiniTest {
    Victini victini;
    Attack mockedAttack;

    Sparks mockedSparks;    //main
    Ember mockedEmber;  //secondary


    @Before
    public void setUp(){
        victini = new Victini();

        mockedAttack = mock(Ember.class);

        mockedSparks = mock(Sparks.class);
        mockedEmber = mock(Ember.class);

    }

    @Test
    public void evolve(){
        assertEquals(null, victini.evolve());
    }

    @Test
    public void isSupperEffective() {
        when(mockedAttack.getAttackType()).thenReturn("ground");
        when(mockedAttack.getAttackDamage()).thenReturn(12);
        when(mockedAttack.getAttackName()).thenReturn("Ember");

        //assertEquals(2, pikachu.getType().defends(mockedAttack), 0.5f);
        assertEquals("Defending attack, damage caused is 9 new HP is 76", victini.defend(mockedAttack));

    }

    @Test
    public void isNotEffective() {
        when(mockedAttack.getAttackType()).thenReturn("grass");
        when(mockedAttack.getAttackDamage()).thenReturn(16);
        when(mockedAttack.getAttackName()).thenReturn("Sparks");

        assertEquals("Defending attack, damage caused is 3 new HP is 82", victini.defend(mockedAttack));

    }

    @Test
    public void isNeutral() {
        when(mockedAttack.getAttackType()).thenReturn("normal");
        when(mockedAttack.getAttackDamage()).thenReturn(7);
        when(mockedAttack.getAttackName()).thenReturn("Scratch");

        assertEquals("Defending attack, damage caused is 2 new HP is 83", victini.defend(mockedAttack));
    }

    @Test
    public void performMainAttack() {
        when(mockedSparks.getAttackDamage()).thenReturn(16);
        when(mockedSparks.getAttackName()).thenReturn("Sparks");

        assertEquals(" ataca con SPARKS intentando hacer "
                + victini.getMainAttack().getAttackDamage() +
                " de daño!", victini.mainAttack());
    }

    @Test
    public void performSecondAttack() {
        when(mockedEmber.getAttackDamage()).thenReturn(12);
        when(mockedEmber.getAttackName()).thenReturn("Ember");

        assertEquals(" ataca con EMBER intentando hacer "
         + victini.getSecondAttack().getAttackDamage() +
                " de daño!", victini.secondAttack());
    }



}
