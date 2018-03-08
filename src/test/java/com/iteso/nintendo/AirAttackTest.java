package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.mockito.Mock;
/**
 * Son estaticos para poder accederlos
 * sin hacer una instancia.
 */
import static org.mockito.Mockito.*;

public class AirAttackTest {
    AirAttack attack;

    @Before
    public void setUp(){
        attack = new AirAttack();
    }

    @Test
    public void getAttackTest(){
        Assert.assertEquals("Air Attack", attack.getAttackName());
    }

    @Test
    public void getAttackDamage(){
        Assert.assertEquals(10, attack.getAttackDamage());
    }

}
