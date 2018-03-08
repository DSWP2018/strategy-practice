package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class CharmanderTest {
    Charmander charmander;
    Attack mockedAttack;

    Rage mockedRage;
    Ember mockedEmber;


    @Before
    public void setUp(){
        charmander = new Charmander();

        mockedAttack = mock(Ember.class);

        mockedRage = mock(Rage.class);
        mockedEmber = mock(Ember.class);

    }

    @Test
    public void evolve(){
        assertEquals(null, charmander.evolve());
    }

    @Test
    public void isSupperEffective() {
        when(mockedAttack.getAttackType()).thenReturn("ground");
        when(mockedAttack.getAttackDamage()).thenReturn(12);
        when(mockedAttack.getAttackName()).thenReturn("Ember");

        assertEquals("Defending attack, damage caused is 7 new HP is 70", charmander.defend(mockedAttack));

    }

    @Test
    public void isNotEffective() {
        when(mockedAttack.getAttackType()).thenReturn("grass");
        when(mockedAttack.getAttackDamage()).thenReturn(16);
        when(mockedAttack.getAttackName()).thenReturn("Sparks");

        assertEquals("Defending attack, damage caused is 2 new HP is 75", charmander.defend(mockedAttack));

    }

    @Test
    public void isNeutral() {
        when(mockedAttack.getAttackType()).thenReturn("normal");
        when(mockedAttack.getAttackDamage()).thenReturn(7);
        when(mockedAttack.getAttackName()).thenReturn("Scratch");

        assertEquals("Defending attack, damage caused " +
                "is 2 new HP is 75", charmander.defend(mockedAttack));
    }

    @Test
    public void performMainAttack() {
        when(mockedRage.getAttackDamage()).thenReturn(9);
        when(mockedRage.getAttackName()).thenReturn("Rage");

        assertEquals(" ataca con RAGE intentando hacer "
                + charmander.getMainAttack().getAttackDamage() +
                " de daño!", charmander.mainAttack());
    }

    @Test
    public void performSecondAttack() {
        when(mockedEmber.getAttackDamage()).thenReturn(12);
        when(mockedEmber.getAttackName()).thenReturn("Ember");

        assertEquals(" ataca con EMBER intentando hacer "
         + charmander.getSecondAttack().getAttackDamage() +
                " de daño!", charmander.secondAttack());
    }



}
