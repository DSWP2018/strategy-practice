package com.iteso.nintendo.PokemonTest;

import com.iteso.nintendo.Moves.*;
import com.iteso.nintendo.Pokemon.*;
import com.iteso.nintendo.PokemonAttack;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

/**
 * Created by Carmen Martinez on 3/07/18.
 */
public class CuboneTest {
    Cubone cubone;
    PokemonAttack mockedMainAttack;
    PokemonAttack mockedSecondAttack;
    PokemonType mockedType;

    @Before
    public void setUp() {
        cubone = new Cubone();
        mockedMainAttack = mock(StompingTantrum.class);
        mockedSecondAttack = mock(Thrash.class);
        mockedType = mock(Ground.class);
        cubone.setMainAttack(mockedMainAttack);
        cubone.setSecondAttack(mockedSecondAttack);
        cubone.setType(mockedType);

    }

    @Test
    public void evolve () {
        assertNull(cubone.evolve());
    }

    @Test
    public void defend() {
        assertEquals("Defending attack, damage caused is 0 new HP is 50",
                cubone.defend(
                        mock(Thunder.class).getAttackDamage(),
                        mock(Electric.class)
                )
        );
        assertEquals(50, cubone.getHitPoints());

    }

    @Test
    public void secondAttack() {
        assertEquals("Attacking opponent with Thrash causing a damage of 120",
                cubone.secondAttack());
    }

    @Test
    public void mainAttack() {
        assertEquals("Attacking opponent with Stomping Tantrum causing a damage of 75",
                cubone.mainAttack());
    }

    @Test
    public void newAttack(){
        cubone.setNewAttack(1, mock(DragonRage.class));
        assertEquals("Dragon Rage", cubone.getMainAttackName());
        cubone.setNewAttack(2,  mock(FireBlast.class));
        assertEquals("Fire Blast", cubone.getSecondAttackName());
    }


}
