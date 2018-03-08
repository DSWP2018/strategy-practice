package com.iteso.nintendo.PokemonTest;

import com.iteso.nintendo.Moves.*;

import com.iteso.nintendo.Pokemon.Gyarados;
import com.iteso.nintendo.PokemonAttack;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Grass;
import com.iteso.nintendo.Types.Water;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

/**
 * Created by Carmen Martinez on 3/07/18.
 */
public class GyaradosTest {
    Gyarados gyrados;
    PokemonAttack mockedMainAttack;
    PokemonAttack mockedSecondAttack;
    PokemonType mockedType;

    @Before
    public void setUp() {
        gyrados = new Gyarados();
        mockedMainAttack = mock(HydroPump.class);
        mockedSecondAttack = mock(DragonRage.class);
        mockedType = mock(Water.class);
        gyrados.setMainAttack(mockedMainAttack);
        gyrados.setSecondAttack(mockedSecondAttack);
        gyrados.setType(mockedType);

    }

    @Test
    public void evolve () {
        assertNull(gyrados.evolve());
    }

    @Test
    public void defend() {
        assertEquals("Defending attack, damage caused is 64 new HP is 66",
                gyrados.defend(
                        mock(SeedBomb.class).getAttackDamage(),
                        mock(Grass.class)
                )
        );
        assertEquals(66, gyrados.getHitPoints());

    }

    @Test
    public void secondAttack() {
        assertEquals("Attacking opponent with Dragon Rage causing a damage of 100",
                gyrados.secondAttack());
    }

    @Test
    public void mainAttack() {
        assertEquals("Attacking opponent with Hydro Pump causing a damage of 110",
                gyrados.mainAttack());
    }

    @Test
    public void newAttack(){
        gyrados.setNewAttack(1, mock(DragonRage.class));
        assertEquals("Dragon Rage", gyrados.getMainAttackName());
        gyrados.setNewAttack(2,  mock(HydroPump.class));
        assertEquals("Hydro Pump", gyrados.getSecondAttackName());
    }


}
