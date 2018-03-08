package com.iteso.nintendo;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FairyTest {

    Fairy fairy;

    Attack mockedAttack;

    @Before
    public void setUp() {
        fairy = new Fairy();

        mockedAttack = mock(Attack.class);


    }

    @Test
    public void isSuperEffective() {
        when(mockedAttack.getAttackType()).thenReturn("poison");

        assertEquals(2, fairy.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isUnnaffected() {
        when(mockedAttack.getAttackType()).thenReturn("dragon");

        assertEquals(0, fairy.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isUnneffective() {
       when(mockedAttack.getAttackType()).thenReturn("fighting");

        assertEquals(0.5, fairy.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isNeutral() {
        when(mockedAttack.getAttackType()).thenReturn("normal");

        assertEquals(1, fairy.defends(mockedAttack), 0.0f);

    }

}

