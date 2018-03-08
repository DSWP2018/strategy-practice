package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by FedericoIbarra
 */
public class HurracarranaTest {
    Attack impacttrueno;

    @Before
    public void setUp(){
        impacttrueno = new ImpactTrueno();
    }

    @Test
    public void performAttack() {
        assertEquals("Attacking opponent with Impact Trueno causing a damage of 12", impacttrueno.performAttack());
    }



}

