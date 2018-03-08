package com.iteso.nintendo;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FireTest {

    Fire fire;

    Attack mockedAttack;

    @Before
    public void setUp() {
        fire = new Fire();

        mockedAttack = mock(Attack.class);


    }

    @Test
    public void isSuperEffective() {
        when(mockedAttack.getAttackType()).thenReturn("ground");

        assertEquals(2, fire.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isUnneffective() {
       when(mockedAttack.getAttackType()).thenReturn("ice");

        assertEquals(0.5, fire.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isNeutral() {
        when(mockedAttack.getAttackType()).thenReturn("normal");

        assertEquals(1, fire.defends(mockedAttack), 0.0f);

    }

}

