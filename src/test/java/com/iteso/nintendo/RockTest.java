package com.iteso.nintendo;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RockTest {

    Rock rock;

    Attack mockedAttack;

    @Before
    public void setUp() {
        rock = new Rock();

        mockedAttack = mock(Attack.class);

    }

    @Test
    public void isSuperEffective() {
        when(mockedAttack.getAttackType()).thenReturn("water");

        assertEquals(2, rock.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isUnnefective() {
       when(mockedAttack.getAttackType()).thenReturn("normal");

        assertEquals(0.5, rock.defends(mockedAttack), 0.0f);

    }
    @Test
    public void isNeutral() {
        when(mockedAttack.getAttackType()).thenReturn("fire");

        assertEquals(1, rock.defends(mockedAttack), 0.0f);

    }

}

