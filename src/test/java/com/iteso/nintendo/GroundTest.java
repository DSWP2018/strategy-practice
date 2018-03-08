package com.iteso.nintendo;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GroundTest {

    Ground ground;

    Attack mockedAttack;

    @Before
    public void setUp() {
        ground = new Ground();

        mockedAttack = mock(Attack.class);

    }

    @Test
    public void isSuperEffective() {
        when(mockedAttack.getAttackType()).thenReturn("water");

        assertEquals(2, ground.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isUnnaffected() {
       when(mockedAttack.getAttackType()).thenReturn("electric");

        assertEquals(0, ground.defends(mockedAttack), 0.0f);

    }    @Test
    public void isUnnefective() {
       when(mockedAttack.getAttackType()).thenReturn("poison");

        assertEquals(0.5, ground.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isNeutral() {
        when(mockedAttack.getAttackType()).thenReturn("normal");

        assertEquals(1, ground.defends(mockedAttack), 0.0f);

    }

}

