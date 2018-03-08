package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by FedericoIbarra
 */
public class FireTypeTest {
    FireType fireType;

    @Before
    public void setUp(){
        fireType = new FireType();
    }

    @Test
    public void tipo() {
        assertEquals("Fire", fireType.getType());
    }

    @Test
    public void factor() {
        assertEquals(10, fireType.defenseFactor(new ElectricityType()));
        assertEquals(1, fireType.defenseFactor(new WaterType()));
        assertEquals(5, fireType.defenseFactor(new LegendaryType()));
    }


}
