package com.iteso.nintendo;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FlyingTest {

    Flying flying;

    Attack mockedAttack;

    @Before
    public void setUp() {
        flying = new Flying();

        mockedAttack = mock(Attack.class);

    }

    @Test
    public void isSuperEffective() {
        when(mockedAttack.getAttackType()).thenReturn("electric");

        assertEquals(2, flying.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isUnnaffected() {
       when(mockedAttack.getAttackType()).thenReturn("ground");

        assertEquals(0, flying.defends(mockedAttack), 0.0f);

    }    @Test
    public void isUnnefective() {
       when(mockedAttack.getAttackType()).thenReturn("grass");

        assertEquals(0.5, flying.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isNeutral() {
        when(mockedAttack.getAttackType()).thenReturn("normal");

        assertEquals(1, flying.defends(mockedAttack), 0.0f);

    }

}

