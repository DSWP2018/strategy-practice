package com.iteso.nintendo;

import com.iteso.nintendo.implementations.attack.SmallFire;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SmallFireTest {
    Attack smallFire;

    @Before
    public void setUp(){
        smallFire = new SmallFire();
    }

    @Test
    public void attackDamage(){
        assertEquals(3, smallFire.getAttackDamage());
    }

    @Test
    public void attackName(){
        assertEquals("Small Fire", smallFire.getNameAttack());
    }

    @Test
    public void attackOpponent(){
        assertEquals("Aventar bolita de fuego", smallFire.attackOpponent());
    }

    @Test
    public void animation(){
        assertEquals("Mover manitas lento", smallFire.animation());
    }
}
