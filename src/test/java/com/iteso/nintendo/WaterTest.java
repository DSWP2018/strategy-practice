package com.iteso.nintendo;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WaterTest {

    Water water;

    Attack mockedAttack;

    @Before
    public void setUp() {
        water = new Water();

        mockedAttack = mock(Attack.class);


    }

    @Test
    public void isSuperEffective() {
        when(mockedAttack.getAttackType()).thenReturn("electric");

        assertEquals(2, water.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isUnneffective() {
       when(mockedAttack.getAttackType()).thenReturn("fire");

        assertEquals(0.5, water.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isNeutral() {
        when(mockedAttack.getAttackType()).thenReturn("normal");

        assertEquals(1, water.defends(mockedAttack), 0.0f);

    }

}


