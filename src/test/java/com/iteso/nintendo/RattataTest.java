package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class RattataTest {
    Rattata rattata;
    Attack mockedAttack;

    Scratch mockedScratch;
    Tackle mockedTackle;


    @Before
    public void setUp(){
        rattata = new Rattata();

        mockedAttack = mock(Ember.class);

        mockedScratch = mock(Scratch.class);
        mockedTackle = mock(Tackle.class);

    }

    @Test
    public void evolve(){
        assertEquals(null, rattata.evolve());
    }

    @Test
    public void isSupperEffective() {
        when(mockedAttack.getAttackType()).thenReturn("fighting");
        when(mockedAttack.getAttackDamage()).thenReturn(12);
        when(mockedAttack.getAttackName()).thenReturn("Ember");

        assertEquals("Defending attack, damage caused is 12 new HP is 39", rattata.defend(mockedAttack));

    }

    @Test
    public void isNotEffective() {
        when(mockedAttack.getAttackType()).thenReturn("ghost");
        when(mockedAttack.getAttackDamage()).thenReturn(16);
        when(mockedAttack.getAttackName()).thenReturn("Sparks");

        assertEquals("Defending attack, damage caused is 0 new HP is 51", rattata.defend(mockedAttack));

    }

    @Test
    public void isNeutral() {
        when(mockedAttack.getAttackType()).thenReturn("normal");
        when(mockedAttack.getAttackDamage()).thenReturn(7);
        when(mockedAttack.getAttackName()).thenReturn("Scratch");

        assertEquals("Defending attack, damage caused is 3 new HP is 48", rattata.defend(mockedAttack));
    }

    @Test
    public void performMainAttack() {
        when(mockedScratch.getAttackDamage()).thenReturn(7);
        when(mockedScratch.getAttackName()).thenReturn("Scratch");

        assertEquals(" ataca con SCRATCH intentando hacer "
                + rattata.getMainAttack().getAttackDamage() +
                " de daño!", rattata.mainAttack());
    }

    @Test
    public void performSecondAttack() {
        when(mockedTackle.getAttackDamage()).thenReturn(14);
        when(mockedTackle.getAttackName()).thenReturn("Tackle");

        assertEquals(" ataca con TACKLE intentando hacer "
         + rattata.getSecondAttack().getAttackDamage() +
                " de daño!", rattata.secondAttack());
    }



}
