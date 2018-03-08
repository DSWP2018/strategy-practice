package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by FedericoIbarra
 */
public class SmallFireTest {
    Attack smallFire;

    @Before
    public void setUp(){
        smallFire = new SmallFire();
    }

    @Test
    public void performAttack() {
        assertEquals("Attacking opponent with Small Fire causing a damage of 3", smallFire.performAttack());
    }



}

