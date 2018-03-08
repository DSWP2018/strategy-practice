package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by FedericoIbarra
 */
public class ImpactTruenoTest {
    HurracarranaAttack hurracarranaAttack;

    @Before
    public void setUp(){
        hurracarranaAttack = new HurracarranaAttack();
    }

    @Test
    public void performAttack() {
        assertEquals("Attacking opponent with Hurracarrana causing a damage of 23", hurracarranaAttack.performAttack());
    }



}

