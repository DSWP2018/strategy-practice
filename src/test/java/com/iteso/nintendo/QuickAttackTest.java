package com.iteso.nintendo;

import com.iteso.nintendo.implementations.attack.QuickAttack;
import com.iteso.nintendo.implementations.attack.SmallFire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuickAttackTest {
    Attack quickAttack;

    @Before
    public void setUp(){
        quickAttack = new QuickAttack();
    }

    @Test
    public void attackDamage(){
        assertEquals(5, quickAttack.getAttackDamage());
    }

    @Test
    public void attackName(){
        assertEquals("QuickAttack", quickAttack.getNameAttack());
    }

    @Test
    public void attackOpponent(){
        assertEquals("Aventar rayito", quickAttack.attackOpponent());
    }

    @Test
    public void animation(){
        assertEquals("Extender manita", quickAttack.animation());
    }
}
