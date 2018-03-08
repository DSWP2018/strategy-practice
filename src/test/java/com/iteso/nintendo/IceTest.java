package com.iteso.nintendo;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IceTest {

    Ice ice;

    Attack mockedAttack;

    @Before
    public void setUp() {
        ice = new Ice();

        mockedAttack = mock(Attack.class);

    }

    @Test
    public void isSuperEffective() {
        when(mockedAttack.getAttackType()).thenReturn("fire");

        assertEquals(2, ice.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isUnneffective() {
       when(mockedAttack.getAttackType()).thenReturn("ice");

        assertEquals(0.5, ice.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isNeutral() {
        when(mockedAttack.getAttackType()).thenReturn("normal");

        assertEquals(1, ice.defends(mockedAttack), 0.0f);

    }

}

