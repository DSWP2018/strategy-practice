package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


/**
 * Created by FedericoIbarra
 */
public class FroslassTest {
    Froslass froslass;

    @Before
    public void setUp(){
        froslass = new Froslass();
    }

    @Test
    public void evolve() {
        assertNull(froslass.evolve());
    }

    @Test
    public void defensa() {
        //4
        assertEquals("Defending attack, damage caused is 4 new HP is 96", froslass.defend(10));
    }

    @Test
    public void ataquePrincipal() {
        assertEquals("Attacking opponent with Hurracarrana causing a damage of 23" , froslass.mainAttack());
    }

    @Test
    public void ataqueSecundario() {
        assertEquals("Attacking opponent with Impact Trueno causing a damage of 12" , froslass.secondAttack());
    }
}

