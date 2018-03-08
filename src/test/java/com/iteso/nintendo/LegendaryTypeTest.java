package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by FedericoIbarra
 */
public class LegendaryTypeTest {
    LegendaryType legendary;

    @Before
    public void setUp(){
        legendary = new LegendaryType();
    }

    @Test
    public void tipo() {
        assertEquals("Legednary", legendary.getType());
    }

    @Test
    public void factor() {
        assertEquals(10, legendary.defenseFactor(new WaterType()));
        assertEquals(10, legendary.defenseFactor(new FireType()));
        assertEquals(10, legendary.defenseFactor(new ElectricityType()));
    }


}

