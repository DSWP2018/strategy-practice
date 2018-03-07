package com.iteso.nintendo.attack_tests;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.implementations.attack.BigFire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BigFireTest {
    Attack BigFire;

    @Before
    public void setUp(){
        BigFire = new BigFire();
    }

    @Test
    public void attackDamage(){
        assertEquals(17, BigFire.getAttackDamage());
    }

    @Test
    public void attackName(){
        assertEquals("BigFire", BigFire.getNameAttack());
    }

    @Test
    public void attackOpponent(){
        assertEquals("Aventar bolota de fuego", BigFire.attackOpponent());
    }

    @Test
    public void animation(){
        assertEquals("Mover manitas rapido", BigFire.animation());
    }
}
