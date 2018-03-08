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
public class SquirtleTest {
    @Mock
    Squirtle squirtle;
    ElectricType electricType;
    FireAttack fireAttack;
    AirAttack airAttack;

    @Before
    public void setUp(){
        squirtle = new Squirtle();
        electricType = mock(ElectricType.class);
        fireAttack = mock(FireAttack.class);
        airAttack = mock(AirAttack.class);
        squirtle.setType(electricType);
        squirtle.setMainAttack(fireAttack);
        squirtle.setSecondAttack(airAttack);
    }

    @Test
    public void getNameTest(){
        Assert.assertEquals("Squirtle", squirtle.getName());
    }

    @Test
    public void setNameTest(){
        squirtle.setName("Squirtle");
        Assert.assertEquals("Squirtle", squirtle.getName());
    }

    @Test
    public void evolveTest(){
        Assert.assertEquals(null, squirtle.evolve());
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Electric", squirtle.getType());
    }

    @Test
    public void setTypeTest(){
        Type electricType = mock(ElectricType.class);
        squirtle.setType(electricType);
        Assert.assertEquals("Electric", squirtle.getType());
    }

    @Test
    public void defend() {
        Assert.assertEquals("Defending attack, damage caused is 3 new HP is 97", squirtle.defend(10));
        Assert.assertEquals(97, squirtle.getHitPoints());
    }

    @Test
    public void isHasEvolutionTest(){
        Assert.assertEquals(true, squirtle.isHasEvolution());
    }

    @Test
    public void setHasEvolutionTest(){
        squirtle.setHasEvolution(false);
        Assert.assertEquals(false, squirtle.isHasEvolution());
        squirtle.setHasEvolution(true);
        Assert.assertEquals(true, squirtle.isHasEvolution());
    }

    @Test
    public void getAndSetMainAttackTest(){
        SoundAttack newMockedMainAttack = mock(SoundAttack.class);
        squirtle.setMainAttack(newMockedMainAttack);
        Assert.assertEquals("Sound Attack", squirtle.getMainAttackName());
    }

    @Test
    public void getAndSetSecondAttackTest(){
        WaterAttack newMockedSecondAttack = mock(WaterAttack.class);
        squirtle.setSecondAttack(newMockedSecondAttack);
        Assert.assertEquals("Water Attack", squirtle.getSecondAttackName());
    }

}
