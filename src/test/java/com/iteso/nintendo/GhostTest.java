package com.iteso.nintendo;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GhostTest {

    Ghost ghost;

    Attack mockedAttack;

    @Before
    public void setUp() {
        ghost = new Ghost();

        mockedAttack = mock(Attack.class);

    }

    @Test
    public void isSuperEffective() {
        when(mockedAttack.getAttackType()).thenReturn("dark");

        assertEquals(2, ghost.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isUnnaffected() {
       when(mockedAttack.getAttackType()).thenReturn("normal");

        assertEquals(0, ghost.defends(mockedAttack), 0.0f);

    }    @Test
    public void isUnnefective() {
       when(mockedAttack.getAttackType()).thenReturn("poison");

        assertEquals(0.5, ghost.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isNeutral() {
        when(mockedAttack.getAttackType()).thenReturn("fire");

        assertEquals(1, ghost.defends(mockedAttack), 0.0f);

    }

}

