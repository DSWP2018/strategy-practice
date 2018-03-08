package com.iteso.nintendo;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SteelTest {

    Steel steel;

    Attack mockedAttack;

    @Before
    public void setUp() {
        steel = new Steel();

        mockedAttack = mock(Attack.class);

    }

    @Test
    public void isSuperEffective() {
        when(mockedAttack.getAttackType()).thenReturn("fire");

        assertEquals(2, steel.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isUnnaffected() {
       when(mockedAttack.getAttackType()).thenReturn("poison");

        assertEquals(0, steel.defends(mockedAttack), 0.0f);

    }    @Test
    public void isUnnefective() {
       when(mockedAttack.getAttackType()).thenReturn("normal");

        assertEquals(0.5, steel.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isNeutral() {
        when(mockedAttack.getAttackType()).thenReturn("dark");

        assertEquals(1, steel.defends(mockedAttack), 0.0f);

    }

}

