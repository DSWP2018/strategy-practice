package com.iteso.nintendo;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PsychicTest {

    Psychic pshychic;

    Attack mockedAttack;

    @Before
    public void setUp() {
        pshychic = new Psychic();

        mockedAttack = mock(Attack.class);

    }

    @Test
    public void isSuperEffective() {
        when(mockedAttack.getAttackType()).thenReturn("ghost");

        assertEquals(2, pshychic.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isUnnefective() {
       when(mockedAttack.getAttackType()).thenReturn("fighting");

        assertEquals(0.5, pshychic.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isNeutral() {
        when(mockedAttack.getAttackType()).thenReturn("normal");

        assertEquals(1, pshychic.defends(mockedAttack), 0.0f);

    }

}

