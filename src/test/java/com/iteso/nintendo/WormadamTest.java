package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


/**
 * Created by FedericoIbarra
 */
public class WormadamTest {
    Wormadam wormadam;

    @Before
    public void setUp(){
        wormadam = new Wormadam();
    }

    @Test
    public void evolve() {
        assertNull(wormadam.evolve());
    }

    @Test
    public void defensa() {
        //4
        assertEquals("Defending attack, damage caused is 4 new HP is 96", wormadam.defend(10));
    }

    @Test
    public void ataquePrincipal() {
        assertEquals("Attacking opponent with Hurracarrana causing a damage of 23" , wormadam.mainAttack());
    }

    @Test
    public void ataqueSecundario() {
        assertEquals("Attacking opponent with Quick Attack causing a damage of 15" , wormadam.secondAttack());
    }
}

