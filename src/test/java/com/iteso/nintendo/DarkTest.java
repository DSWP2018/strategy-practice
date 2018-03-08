package com.iteso.nintendo;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DarkTest {

    Dark dark;

    Attack mockedAttack;

    @Before
    public void setUp() {
        dark = new Dark();

        mockedAttack = mock(Attack.class);


    }

    @Test
    public void isSuperEffective() {
        when(mockedAttack.getAttackType()).thenReturn("fighting");

        assertEquals(2, dark.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isUnnaffected() {
       when(mockedAttack.getAttackType()).thenReturn("psychic");

        assertEquals(0, dark.defends(mockedAttack), 0.0f);

    }    @Test
    public void isUnnefective() {
       when(mockedAttack.getAttackType()).thenReturn("ghost");

        assertEquals(0.5, dark.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isNeutral() {
        when(mockedAttack.getAttackType()).thenReturn("normal");

        assertEquals(1, dark.defends(mockedAttack), 0.0f);

    }

}

