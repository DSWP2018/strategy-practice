package com.iteso.nintendo;

import com.iteso.nintendo.type.Electric;
import com.iteso.nintendo.type.Fighting;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FightingTest {

    Fighting type;

    @Before
    public void setUp(){
        type = new Fighting();
    }

    @Test
    public void getType(){
        Assert.assertEquals("Fighting", type.getType());
    }
}
