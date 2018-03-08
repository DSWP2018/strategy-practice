package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by FedericoIbarra
 */
public class BigFireTest {
    Attack bigFire;

    @Before
    public void setUp(){
        bigFire = new BigFire();
    }

    @Test
    public void performAttack() {
        assertEquals("Attacking opponent with Big Fire causing a damage of 17", bigFire.performAttack());
    }



}

