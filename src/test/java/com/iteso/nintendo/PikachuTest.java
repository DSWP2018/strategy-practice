package com.iteso.nintendo;

import org.junit.Before;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by FedericoIbarra
 */
public class PikachuTest {
    Pikachu pikachu;

    @Before
    public void setUp(){
        pikachu = new Pikachu();
    }

    @Test
    public void evolve() {
        assertNull(pikachu.evolve());
    }

    @Test
    public void defensa() {
        //4
        assertEquals("Defending attack, damage caused is 4 new HP is 96", pikachu.defend(10));
    }

    @Test
    public void ataquePrincipal() {
        assertEquals("Attacking opponent with Hurracarrana causing a damage of 23" , pikachu.mainAttack());
    }

    @Test
    public void ataqueSecundario() {
        assertEquals("Attacking opponent with Impact Trueno causing a damage of 12" , pikachu.secondAttack());
    }
}

