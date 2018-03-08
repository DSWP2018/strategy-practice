package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by FedericoIbarra
 */
public class WaterTypeTest {
    WaterType waterType;

    @Before
    public void setUp(){
        waterType = new WaterType();
    }

    @Test
    public void tipo() {
        assertEquals("Water", waterType.getType());
    }

    @Test
    public void factor() {
        assertEquals(10, waterType.defenseFactor(new FireType()));
        assertEquals(1, waterType.defenseFactor(new ElectricityType()));
        assertEquals(5, waterType.defenseFactor(new Woodtype()));
    }


}

