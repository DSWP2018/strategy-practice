package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;

/**
 * Son estaticos para poder accederlos
 * sin hacer una instancia.
 */

/**
 * Created by rvillalobos on 2/24/18.
 */
public class GardevoirTest {
    @Mock
    Gardevoir gardevoir;
    ElectricType electricType;
    FireAttack fireAttack;
    AirAttack airAttack;

    @Before
    public void setUp(){
        gardevoir = new Gardevoir();
        electricType = mock(ElectricType.class);
        fireAttack = mock(FireAttack.class);
        airAttack = mock(AirAttack.class);
        gardevoir.setType(electricType);
        gardevoir.setMainAttack(fireAttack);
        gardevoir.setSecondAttack(airAttack);
    }

    @Test
    public void getNameTest(){
        Assert.assertEquals("Gardevoir", gardevoir.getName());
    }

    @Test
    public void setNameTest(){
        gardevoir.setName("Gardevoir");
        Assert.assertEquals("Gardevoir", gardevoir.getName());
    }

    @Test
    public void evolveTest(){
        Assert.assertEquals(null, gardevoir.evolve());
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Electric", gardevoir.getType());
    }

    @Test
    public void setTypeTest(){
        Type electricType = mock(ElectricType.class);
        gardevoir.setType(electricType);
        Assert.assertEquals("Electric", gardevoir.getType());
    }

    @Test
    public void defend() {
        Assert.assertEquals("Defending attack, damage caused is 3 new HP is 97", gardevoir.defend(10));
        Assert.assertEquals(97, gardevoir.getHitPoints());
    }

    @Test
    public void isHasEvolutionTest(){
        Assert.assertEquals(true, gardevoir.isHasEvolution());
    }

    @Test
    public void setHasEvolutionTest(){
        gardevoir.setHasEvolution(false);
        Assert.assertEquals(false, gardevoir.isHasEvolution());
        gardevoir.setHasEvolution(true);
        Assert.assertEquals(true, gardevoir.isHasEvolution());
    }

    @Test
    public void getAndSetMainAttackTest(){
        SoundAttack newMockedMainAttack = mock(SoundAttack.class);
        gardevoir.setMainAttack(newMockedMainAttack);
        Assert.assertEquals("Sound Attack", gardevoir.getMainAttackName());
    }

    @Test
    public void getAndSetSecondAttackTest(){
        WaterAttack newMockedSecondAttack = mock(WaterAttack.class);
        gardevoir.setSecondAttack(newMockedSecondAttack);
        Assert.assertEquals("Water Attack", gardevoir.getSecondAttackName());
    }

}
