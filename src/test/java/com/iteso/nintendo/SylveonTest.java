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
public class SylveonTest {
    @Mock
    Sylveon sylveon;
    ElectricType electricType;
    FireAttack fireAttack;
    AirAttack airAttack;

    @Before
    public void setUp(){
        sylveon = new Sylveon();
        electricType = mock(ElectricType.class);
        fireAttack = mock(FireAttack.class);
        airAttack = mock(AirAttack.class);
        sylveon.setType(electricType);
        sylveon.setMainAttack(fireAttack);
        sylveon.setSecondAttack(airAttack);
    }

    @Test
    public void getNameTest(){
        Assert.assertEquals("Sylveon", sylveon.getName());
    }

    @Test
    public void setNameTest(){
        sylveon.setName("Sylveon");
        Assert.assertEquals("Sylveon", sylveon.getName());
    }

    @Test
    public void evolveTest(){
        Assert.assertEquals(null, sylveon.evolve());
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Electric", sylveon.getType());
    }

    @Test
    public void setTypeTest(){
        Type electricType = mock(ElectricType.class);
        sylveon.setType(electricType);
        Assert.assertEquals("Electric", sylveon.getType());
    }

    @Test
    public void defend() {
        Assert.assertEquals("Defending attack, damage caused is 3 new HP is 97", sylveon.defend(10));
        Assert.assertEquals(97, sylveon.getHitPoints());
    }

    @Test
    public void isHasEvolutionTest(){
        Assert.assertEquals(true, sylveon.isHasEvolution());
    }

    @Test
    public void setHasEvolutionTest(){
        sylveon.setHasEvolution(false);
        Assert.assertEquals(false, sylveon.isHasEvolution());
        sylveon.setHasEvolution(true);
        Assert.assertEquals(true, sylveon.isHasEvolution());
    }

    @Test
    public void getAndSetMainAttackTest(){
        SoundAttack newMockedMainAttack = mock(SoundAttack.class);
        sylveon.setMainAttack(newMockedMainAttack);
        Assert.assertEquals("Sound Attack", sylveon.getMainAttackName());
    }

    @Test
    public void getAndSetSecondAttackTest(){
        WaterAttack newMockedSecondAttack = mock(WaterAttack.class);
        sylveon.setSecondAttack(newMockedSecondAttack);
        Assert.assertEquals("Water Attack", sylveon.getSecondAttackName());
    }

}
