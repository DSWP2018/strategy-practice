package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


/**
 * Created by FedericoIbarra
 */
public class CharmanderTest {
    Charmander charmander;

    @Before
    public void setUp(){
        charmander = new Charmander();
    }

    @Test
    public void evolve() {
        assertNull(charmander.evolve());
    }

    @Test
    public void defensa() {
        //4
        assertEquals("Defending attack, damage caused is 3 new HP is 74", charmander.defend(10));
    }

    @Test
    public void ataquePrincipal() {
        assertEquals("Attacking opponent with Big Fire causing a damage of 17" , charmander.mainAttack());
    }

    @Test
    public void ataqueSecundario() {
        assertEquals("Attacking opponent with Small Fire causing a damage of 3" , charmander.secondAttack());
    }
}

