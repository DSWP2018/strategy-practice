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
public class CelebiTest {
    @Mock
    Celebi celebi;
    ElectricType electricType;
    FireAttack fireAttack;
    AirAttack airAttack;

    @Before
    public void setUp(){
        celebi = new Celebi();
        electricType = mock(ElectricType.class);
        fireAttack = mock(FireAttack.class);
        airAttack = mock(AirAttack.class);
        celebi.setType(electricType);
        celebi.setMainAttack(fireAttack);
        celebi.setSecondAttack(airAttack);
    }

    @Test
    public void getNameTest(){
        Assert.assertEquals("Celebi", celebi.getName());
    }

    @Test
    public void setNameTest(){
        celebi.setName("Celebi");
        Assert.assertEquals("Celebi", celebi.getName());
    }

    @Test
    public void evolveTest(){
        Assert.assertEquals(null, celebi.evolve());
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Electric", celebi.getType());
    }

    @Test
    public void setTypeTest(){
        Type electricType = mock(ElectricType.class);
        celebi.setType(electricType);
        Assert.assertEquals("Electric", celebi.getType());
    }

    @Test
    public void defend() {
        Assert.assertEquals("Defending attack, damage caused is 3 new HP is 97", celebi.defend(10));
        Assert.assertEquals(97, celebi.getHitPoints());
    }

    @Test
    public void isHasEvolutionTest(){
        Assert.assertEquals(true, celebi.isHasEvolution());
    }

    @Test
    public void setHasEvolutionTest(){
        celebi.setHasEvolution(false);
        Assert.assertEquals(false, celebi.isHasEvolution());
        celebi.setHasEvolution(true);
        Assert.assertEquals(true, celebi.isHasEvolution());
    }

    @Test
    public void getAndSetMainAttackTest(){
        SoundAttack newMockedMainAttack = mock(SoundAttack.class);
        celebi.setMainAttack(newMockedMainAttack);
        Assert.assertEquals("Sound Attack", celebi.getMainAttackName());
    }

    @Test
    public void getAndSetSecondAttackTest(){
        WaterAttack newMockedSecondAttack = mock(WaterAttack.class);
        celebi.setSecondAttack(newMockedSecondAttack);
        Assert.assertEquals("Water Attack", celebi.getSecondAttackName());
    }

}
