package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by FedericoIbarra
 */
public class WoodTypeTest {
    Woodtype wood;

    @Before
    public void setUp(){
        wood = new Woodtype();
    }

    @Test
    public void tipo() {
        assertEquals("Wood", wood.getType());
    }

    @Test
    public void factor() {
        assertEquals(10, wood.defenseFactor(new WaterType()));
        assertEquals(1, wood.defenseFactor(new FireType()));
        assertEquals(5, wood.defenseFactor(new ElectricityType()));
    }


}

