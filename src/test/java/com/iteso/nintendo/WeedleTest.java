package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


/**
 * Created by FedericoIbarra
 */
public class WeedleTest {
    Weedle weedle;

    @Before
    public void setUp(){
        weedle = new Weedle();
    }

    @Test
    public void evolve() {
        assertNull(weedle.evolve());
    }

    @Test
    public void defensa() {
        //4
        assertEquals("Defending attack, damage caused is 4 new HP is 96", weedle.defend(10));
    }

    @Test
    public void ataquePrincipal() {
        assertEquals("Attacking opponent with Hurracarrana causing a damage of 23" , weedle.mainAttack());
    }

    @Test
    public void ataqueSecundario() {
        assertEquals("Attacking opponent with Quick Attack causing a damage of 15" , weedle.secondAttack());
    }
}

