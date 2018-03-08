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
public class CharmanderTest {
    @Mock
    Charmander charmander;
    ElectricType electricType;
    FireAttack fireAttack;
    AirAttack airAttack;

    @Before
    public void setUp(){
        charmander = new Charmander();
        electricType = mock(ElectricType.class);
        fireAttack = mock(FireAttack.class);
        airAttack = mock(AirAttack.class);
        charmander.setType(electricType);
        charmander.setMainAttack(fireAttack);
        charmander.setSecondAttack(airAttack);
    }

    @Test
    public void getNameTest(){
        Assert.assertEquals("Charmander", charmander.getName());
    }

    @Test
    public void setNameTest(){
        charmander.setName("Charmander");
        Assert.assertEquals("Charmander", charmander.getName());
    }

    @Test
    public void evolveTest(){
        Assert.assertEquals(null, charmander.evolve());
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Electric", charmander.getType());
    }

    @Test
    public void setTypeTest(){
        Type electricType = mock(ElectricType.class);
        charmander.setType(electricType);
        Assert.assertEquals("Electric", charmander.getType());
    }

    @Test
    public void defend() {
        Assert.assertEquals("Defending attack, damage caused is 3 new HP is 97", charmander.defend(10));
        Assert.assertEquals(97, charmander.getHitPoints());
    }

    @Test
    public void isHasEvolutionTest(){
        Assert.assertEquals(true, charmander.isHasEvolution());
    }

    @Test
    public void setHasEvolutionTest(){
        charmander.setHasEvolution(false);
        Assert.assertEquals(false, charmander.isHasEvolution());
        charmander.setHasEvolution(true);
        Assert.assertEquals(true, charmander.isHasEvolution());
    }

    @Test
    public void getAndSetMainAttackTest(){
        Attack newMockedMainAttack = mock(SoundAttack.class);
        charmander.setMainAttack(newMockedMainAttack);
        Assert.assertEquals("Sound Attack", charmander.getMainAttackName());
    }

    @Test
    public void getAndSetSecondAttackTest(){
        Attack newMockedSecondAttack = mock(WaterAttack.class);
        charmander.setSecondAttack(newMockedSecondAttack);
        Assert.assertEquals("Water Attack", charmander.getSecondAttackName());
    }

}
