package com.iteso.nintendo.TypesTest;

import com.iteso.nintendo.Types.Electric;
import com.iteso.nintendo.Types.Fighting;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by julianlz96 on 2/24/18.
 */
public class FightingTest {

    private Fighting fighting;

    @Before //SetUp
    public void setUp(){
        fighting = new Fighting();
    }

    @Test
    public void getDefenseTypesTest(){
        assertEquals(2.0, fighting.getDefenseTypes("Flying"), 0.1);

    }

    @Test
    public void getTypeName(){
        assertEquals("Fighting", fighting.getTypeName());
    }

}
