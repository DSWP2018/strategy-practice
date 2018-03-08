package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


/**
 * Created by FedericoIbarra
 */
public class RayquazaTest {
    Rayquaza rayquaza;

    @Before
    public void setUp(){
        rayquaza = new Rayquaza();
    }

    @Test
    public void evolve() {
        assertNull(rayquaza.evolve());
    }

    @Test
    public void defensa() {
        //4
        assertEquals("Defending attack, damage caused is 4 new HP is 96", rayquaza.defend(10));
    }

    @Test
    public void ataquePrincipal() {
        assertEquals("Attacking opponent with Hurracarrana causing a damage of 23" , rayquaza.mainAttack());
    }

    @Test
    public void ataqueSecundario() {
        assertEquals("Attacking opponent with Impact Trueno causing a damage of 12" , rayquaza.secondAttack());
    }
}

