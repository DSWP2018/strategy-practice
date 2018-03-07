package com.iteso.nintendo;

import com.iteso.nintendo.implementations.attack.ImpactTrueno;
import com.iteso.nintendo.implementations.attack.SmallFire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImpactTruenoTest {
    Attack impactTrueno;

    @Before
    public void setUp(){
        impactTrueno = new ImpactTrueno();
    }

    @Test
    public void attackDamage(){
        assertEquals(15, impactTrueno.getAttackDamage());
    }

    @Test
    public void attackName(){
        assertEquals("ImpactTrueno", impactTrueno.getNameAttack());
    }

    @Test
    public void attackOpponent(){
        assertEquals("Aventar rayote", impactTrueno.attackOpponent());
    }

    @Test
    public void animation(){
        assertEquals("Extender dos manitas", impactTrueno.animation());
    }
}
