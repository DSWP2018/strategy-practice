package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.mockito.Mock;
/**
 * Son estaticos para poder accederlos
 * sin hacer una instancia.
 */
import static org.mockito.Mockito.*;

public class ElectricTypeTest {
    ElectricType electricType;

    @Before
    public void setUp(){
        electricType = new ElectricType();
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Electric", electricType.getType());
    }

    @Test
    public void getDamageMultiplierTest(){
        Assert.assertEquals(0.7, electricType.getDamageMultiplier(), 0.0);
    }

    @Test
    public void getDefenseMultiplierTest(){
        Assert.assertEquals(0.3, electricType.getDefenseMultiplier(), 0.0);
    }

}
