package com.iteso.nintendo.TypesTest;

import com.iteso.nintendo.Types.Fighting;
import com.iteso.nintendo.Types.Fire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by julianlz96 on 2/24/18.
 */
public class FireTest {

    private Fire fire;

    @Before //SetUp
    public void setUp(){
        fire = new Fire();
    }

    @Test
    public void getDefenseTypesTest(){
        assertEquals(0.5, fire.getDefenseTypes("Fire"), 0.1);

    }

    @Test
    public void getTypeName(){
        assertEquals("Fire", fire.getTypeName());
    }

}
