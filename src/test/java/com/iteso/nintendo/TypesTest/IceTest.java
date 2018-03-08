package com.iteso.nintendo.TypesTest;

import com.iteso.nintendo.Types.Fire;
import com.iteso.nintendo.Types.Ice;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by julianlz96 on 2/24/18.
 */
public class IceTest {

    private Ice ice;

    @Before //SetUp
    public void setUp(){
        ice = new Ice();
    }

    @Test
    public void getDefenseTypesTest(){
        assertEquals(2.0, ice.getDefenseTypes("Fire"), 0.1);

    }

    @Test
    public void getTypeName(){
        assertEquals("Ice", ice.getTypeName());
    }

}
