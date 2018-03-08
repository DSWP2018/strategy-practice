package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


/**
 * Created by FedericoIbarra
 */
public class ElectricTypeTest {
    ElectricityType electricityType;

    @Before
    public void setUp(){
        electricityType = new ElectricityType();
    }

    @Test
    public void tipo() {
        assertEquals("Electricity", electricityType.getType());
    }

    @Test
    public void factor() {
        assertEquals(10, electricityType.defenseFactor(new FireType()));
        assertEquals(1, electricityType.defenseFactor(new Woodtype()));
        assertEquals(5, electricityType.defenseFactor(new ElectricityType()));
    }


}

