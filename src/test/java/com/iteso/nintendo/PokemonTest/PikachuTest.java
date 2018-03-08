package com.iteso.nintendo.PokemonTest;

import com.iteso.nintendo.Moves.*;
import com.iteso.nintendo.Pokemon.Pikachu;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

import com.iteso.nintendo.PokemonAttack;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Electric;
import com.iteso.nintendo.Moves.Spark;
import com.iteso.nintendo.Types.Water;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class PikachuTest {
    Pikachu pikachu;
    PokemonAttack mockedMainAttack;
    PokemonAttack mockedSecondAttack;
    PokemonType mockedType;

    @Before
    public void setUp() {
        pikachu = new Pikachu();
        mockedMainAttack = mock(Spark.class);
        mockedSecondAttack = mock(Thunder.class);
        mockedType = mock(Electric.class);
        pikachu.setMainAttack(mockedMainAttack);
        pikachu.setSecondAttack(mockedSecondAttack);
        pikachu.setType(mockedType);

    }

    @Test
    public void evolve () {
        assertNull(pikachu.evolve());
    }

    @Test
    public void defend() {
        assertEquals("Defending attack, damage caused is 44 new HP is 0",
                pikachu.defend(
                        mock(HydroPump.class).getAttackDamage(),
                        mock(Water.class)
                )
        );
        assertEquals(0, pikachu.getHitPoints());
    }

    @Test
    public void secondAttack() {
        assertEquals("Attacking opponent with Thunder causing a damage of 110",
                pikachu.secondAttack());
    }

    @Test
    public void mainAttack() {
        assertEquals("Attacking opponent with Spark causing a damage of 65",
                pikachu.mainAttack());
    }

    @Test
    public void newAttack(){
        pikachu.setNewAttack(1, mock(Thrash.class));
        assertEquals("Thrash", pikachu.getMainAttackName());
        pikachu.setNewAttack(2,  mock(Confusion.class));
        assertEquals("Confusion", pikachu.getSecondAttackName());
    }


}
