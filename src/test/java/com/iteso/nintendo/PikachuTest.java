package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class PikachuTest {
    Pikachu pikachu;
    Attack mockedAttack;

    Sparks mockedSparks;
    Tackle mockedTackle;


    @Before
    public void setUp(){
        pikachu = new Pikachu();

        mockedAttack = mock(Ember.class);

        mockedSparks = mock(Sparks.class);
        mockedTackle = mock(Tackle.class);

    }

    @Test
    public void evolve(){
        assertEquals(null, pikachu.evolve());
    }

    @Test
    public void isSupperEffective() {
        when(mockedAttack.getAttackType()).thenReturn("ground");
        when(mockedAttack.getAttackDamage()).thenReturn(12);
        when(mockedAttack.getAttackName()).thenReturn("Ember");

        //assertEquals(2, pikachu.getType().defends(mockedAttack), 0.5f);
        assertEquals("Defending attack, damage caused is 9 new HP is 91", pikachu.defend(mockedAttack));

    }

    @Test
    public void isNotEffective() {
        when(mockedAttack.getAttackType()).thenReturn("electric");
        when(mockedAttack.getAttackDamage()).thenReturn(16);
        when(mockedAttack.getAttackName()).thenReturn("Sparks");

        assertEquals("Defending attack, damage caused is 3 new HP is 97", pikachu.defend(mockedAttack));

    }

    @Test
    public void isNeutral() {
        when(mockedAttack.getAttackType()).thenReturn("normal");
        when(mockedAttack.getAttackDamage()).thenReturn(7);
        when(mockedAttack.getAttackName()).thenReturn("Scratch");

        assertEquals("Defending attack, damage caused is 2 new HP is 98", pikachu.defend(mockedAttack));
    }

    @Test
    public void performMainAttack() {
        when(mockedSparks.getAttackDamage()).thenReturn(16);
        when(mockedSparks.getAttackName()).thenReturn("Sparks");

        assertEquals(" ataca con SPARKS intentando hacer "
                + pikachu.getMainAttack().getAttackDamage() +
                " de daño!", pikachu.mainAttack());
    }

    @Test
    public void performSecondAttack() {
        when(mockedTackle.getAttackDamage()).thenReturn(14);
        when(mockedTackle.getAttackName()).thenReturn("Tackle");

        assertEquals(" ataca con TACKLE intentando hacer "
         + pikachu.getSecondAttack().getAttackDamage() +
                " de daño!", pikachu.secondAttack());
    }



}
