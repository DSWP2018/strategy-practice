package com.iteso.nintendo;

import com.iteso.nintendo.type.Fire;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FireTest {
    Fire fire;

    @Before
    public void setUp(){
        fire = new Fire();
    }

    @Test
    public void getType(){
        Assert.assertEquals("Fire", fire.getType());
    }
}