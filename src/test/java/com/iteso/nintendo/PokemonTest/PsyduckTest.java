package com.iteso.nintendo.PokemonTest;

import com.iteso.nintendo.Moves.*;
import com.iteso.nintendo.Pokemon.Psyduck;
import com.iteso.nintendo.PokemonAttack;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Fire;
import com.iteso.nintendo.Types.Water;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

/**
 * Created by Carmen Martinez on 3/07/18.
 */
public class PsyduckTest {
    Psyduck psyduck;
    PokemonAttack mockedMainAttack;
    PokemonAttack mockedSecondAttack;
    PokemonType mockedType;

    @Before
    public void setUp() {
        psyduck = new Psyduck();
        mockedMainAttack = mock(HydroPump.class);
        mockedSecondAttack = mock(Confusion.class);
        mockedType = mock(Water.class);
        psyduck.setMainAttack(mockedMainAttack);
        psyduck.setSecondAttack(mockedSecondAttack);
        psyduck.setType(mockedType);

    }

    @Test
    public void evolve () {
        assertNull(psyduck.evolve());
    }

    @Test
    public void defend() {
        assertEquals("Defending attack, damage caused is 11 new HP is 109",
                psyduck.defend(
                        mock(FireBlast.class).getAttackDamage(),
                        mock(Fire.class)
                )
        );
        assertEquals(109, psyduck.getHitPoints());

    }

    @Test
    public void secondAttack() {
        assertEquals("Attacking opponent with Confusion causing a damage of 50",
                psyduck.secondAttack());
    }

    @Test
    public void mainAttack() {
        assertEquals("Attacking opponent with Hydro Pump causing a damage of 110",
                psyduck.mainAttack());
    }

    @Test
    public void newAttack(){
        psyduck.setNewAttack(1, mock(TakeDown.class));
        assertEquals("Take Down", psyduck.getMainAttackName());
        psyduck.setNewAttack(2,  mock(Thunder.class));
        assertEquals("Thunder", psyduck.getSecondAttackName());
    }


}
