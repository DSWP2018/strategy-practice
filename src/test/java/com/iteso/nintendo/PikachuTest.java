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

/**
 * Created by rvillalobos on 2/24/18.
 */
public class PikachuTest {
    @Mock
    Pikachu pikachu;
    ElectricType electricType;
    FireAttack fireAttack;
    AirAttack airAttack;

    @Before
    public void setUp(){
        pikachu = new Pikachu();
        electricType = mock(ElectricType.class);
        fireAttack = mock(FireAttack.class);
        airAttack = mock(AirAttack.class);
        pikachu.setType(electricType);
        pikachu.setMainAttack(fireAttack);
        pikachu.setSecondAttack(airAttack);
    }

    @Test
    public void getNameTest(){
        Assert.assertEquals("Pikachu", pikachu.getName());
    }

    @Test
    public void setNameTest(){
        pikachu.setName("Pikachu");
        Assert.assertEquals("Pikachu", pikachu.getName());
    }

    @Test
    public void evolveTest(){
        Assert.assertEquals(null, pikachu.evolve());
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Electric", pikachu.getType());
    }

    @Test
    public void setTypeTest(){
        Type electricType = mock(ElectricType.class);
        pikachu.setType(electricType);
        Assert.assertEquals("Electric",pikachu.getType());
    }

    @Test
    public void defend() {
        Assert.assertEquals("Defending attack, damage caused is 3 new HP is 97", pikachu.defend(10));
        Assert.assertEquals(97, pikachu.getHitPoints());
    }

    @Test
    public void isHasEvolutionTest(){
        Assert.assertEquals(true, pikachu.isHasEvolution());
    }

    @Test
    public void setHasEvolutionTest(){
        pikachu.setHasEvolution(false);
        Assert.assertEquals(false, pikachu.isHasEvolution());
        pikachu.setHasEvolution(true);
        Assert.assertEquals(true, pikachu.isHasEvolution());
    }

    @Test
    public void getAndSetMainAttackTest(){
        SoundAttack newMockedMainAttack = mock(SoundAttack.class);
        pikachu.setMainAttack(newMockedMainAttack);
        Assert.assertEquals("Sound Attack", pikachu.getMainAttackName());
    }

    @Test
    public void getAndSetSecondAttackTest(){
        WaterAttack newMockedSecondAttack = mock(WaterAttack.class);
        pikachu.setSecondAttack(newMockedSecondAttack);
        Assert.assertEquals("Water Attack", pikachu.getSecondAttackName());
    }

}
