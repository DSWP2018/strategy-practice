package com.iteso.nintendo;


import org.junit.Test;
import org.junit.Before;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class NormalTest {

    Normal normal;

    Attack mockedAttack;

    @Before
    public void setUp() {
        normal = new Normal();

        mockedAttack = mock(Attack.class);


    }

    @Test
    public void isSuperEffective() {
        when(mockedAttack.getAttackType()).thenReturn("fighting");

        assertEquals(2, normal.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isUnnaffected() {
       when(mockedAttack.getAttackType()).thenReturn("ghost");

        assertEquals(0, normal.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isNeutral() {
        when(mockedAttack.getAttackType()).thenReturn("normal");

        assertEquals(1, normal.defends(mockedAttack), 0.0f);

    }

}

