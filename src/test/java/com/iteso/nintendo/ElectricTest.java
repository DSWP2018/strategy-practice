package com.iteso.nintendo;

import com.iteso.nintendo.type.Electric;
import com.iteso.nintendo.type.Fire;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElectricTest {

    Electric type;

    @Before
    public void setUp(){
        type = new Electric();
    }

    @Test
    public void getType(){
        Assert.assertEquals("Electric", type.getType());
    }
}
