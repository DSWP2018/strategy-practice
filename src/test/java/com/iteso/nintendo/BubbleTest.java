package com.iteso.nintendo;

import com.iteso.nintendo.implementations.attack.BigFire;
import com.iteso.nintendo.implementations.attack.Bubble;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BubbleTest {
    Attack bubble;

    @Before
    public void setUp(){
        bubble = new Bubble();
    }

    @Test
    public void attackDamage(){
        assertEquals(7, bubble.getAttackDamage());
    }

    @Test
    public void attackName(){
        assertEquals("Bubble", bubble.getNameAttack());
    }

    @Test
    public void attackOpponent(){
        assertEquals("Aventar burbujas", bubble.attackOpponent());
    }

    @Test
    public void animation(){
        assertEquals("Agitar manitas", bubble.animation());
    }
}
