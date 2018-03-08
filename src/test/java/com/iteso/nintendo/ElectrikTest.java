package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


/**
 * Created by FedericoIbarra
 */
public class ElectrikTest {
    Electrik electrik;

    @Before
    public void setUp(){
        electrik = new Electrik();
    }

    @Test
    public void evolve() {
        assertNull(electrik.evolve());
    }

    @Test
    public void defensa() {
        //4
        assertEquals("Defending attack, damage caused is 4 new HP is 96", electrik.defend(10));
    }

    @Test
    public void ataquePrincipal() {
        assertEquals("Attacking opponent with Hurracarrana causing a damage of 23" , electrik.mainAttack());
    }

    @Test
    public void ataqueSecundario() {
        assertEquals("Attacking opponent with Impact Trueno causing a damage of 12" , electrik.secondAttack());
    }
}

