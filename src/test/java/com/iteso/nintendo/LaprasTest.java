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
public class LaprasTest {
    @Mock
    Lapras lapras;
    ElectricType electricType;
    FireAttack fireAttack;
    AirAttack airAttack;

    @Before
    public void setUp(){
        lapras = new Lapras();
        electricType = mock(ElectricType.class);
        fireAttack = mock(FireAttack.class);
        airAttack = mock(AirAttack.class);
        lapras.setType(electricType);
        lapras.setMainAttack(fireAttack);
        lapras.setSecondAttack(airAttack);
    }

    @Test
    public void getNameTest(){
        Assert.assertEquals("Lapras", lapras.getName());
    }

    @Test
    public void setNameTest(){
        lapras.setName("Lapras");
        Assert.assertEquals("Lapras", lapras.getName());
    }

    @Test
    public void evolveTest(){
        Assert.assertEquals(null, lapras.evolve());
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Electric", lapras.getType());
    }

    @Test
    public void setTypeTest(){
        Type electricType = mock(ElectricType.class);
        lapras.setType(electricType);
        Assert.assertEquals("Electric", lapras.getType());
    }

    @Test
    public void defend() {
        Assert.assertEquals("Defending attack, damage caused is 3 new HP is 97", lapras.defend(10));
        Assert.assertEquals(97, lapras.getHitPoints());
    }

    @Test
    public void isHasEvolutionTest(){
        Assert.assertEquals(true, lapras.isHasEvolution());
    }

    @Test
    public void setHasEvolutionTest(){
        lapras.setHasEvolution(false);
        Assert.assertEquals(false, lapras.isHasEvolution());
        lapras.setHasEvolution(true);
        Assert.assertEquals(true, lapras.isHasEvolution());
    }

    @Test
    public void getAndSetMainAttackTest(){
        SoundAttack newMockedMainAttack = mock(SoundAttack.class);
        lapras.setMainAttack(newMockedMainAttack);
        Assert.assertEquals("Sound Attack", lapras.getMainAttackName());
    }

    @Test
    public void getAndSetSecondAttackTest(){
        WaterAttack newMockedSecondAttack = mock(WaterAttack.class);
        lapras.setSecondAttack(newMockedSecondAttack);
        Assert.assertEquals("Water Attack", lapras.getSecondAttackName());
    }

}
