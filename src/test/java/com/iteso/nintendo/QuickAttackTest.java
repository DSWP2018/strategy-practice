package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by FedericoIbarra
 */
public class QuickAttackTest {
    QuickAttack quickAttack;

    @Before
    public void setUp(){
        quickAttack = new QuickAttack();
    }

    @Test
    public void performAttack() {
        assertEquals("Attacking opponent with Quick Attack causing a damage of 15", quickAttack.performAttack());
    }



}

