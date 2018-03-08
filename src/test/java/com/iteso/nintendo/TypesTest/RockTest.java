package com.iteso.nintendo.TypesTest;

import com.iteso.nintendo.Types.Ice;
import com.iteso.nintendo.Types.Rock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by julianlz96 on 2/24/18.
 */
public class RockTest {

    private Rock rock;

    @Before //SetUp
    public void setUp(){
        rock = new Rock();
    }

    @Test
    public void getDefenseTypesTest(){
        assertEquals(2.0, rock.getDefenseTypes("Water"), 0.1);

    }

    @Test
    public void getTypeName(){
        assertEquals("Rock", rock.getTypeName());
    }

}
