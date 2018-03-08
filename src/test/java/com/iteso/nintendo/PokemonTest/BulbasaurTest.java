package com.iteso.nintendo.PokemonTest;

import com.iteso.nintendo.Moves.*;
import com.iteso.nintendo.Pokemon.Bulbasaur;
import com.iteso.nintendo.Pokemon.Charmander;
import com.iteso.nintendo.PokemonAttack;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Electric;
import com.iteso.nintendo.Types.Fire;
import com.iteso.nintendo.Types.Grass;
import com.iteso.nintendo.Types.Ground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

/**
 * Created by Carmen Martinez on 3/07/18.
 */
public class BulbasaurTest {
    Bulbasaur bulbasaur;
    PokemonAttack mockedMainAttack;
    PokemonAttack mockedSecondAttack;
    PokemonType mockedType;

    @Before
    public void setUp() {
        bulbasaur = new Bulbasaur();
        mockedMainAttack = mock(TakeDown.class);
        mockedSecondAttack = mock(SeedBomb.class);
        mockedType = mock(Grass.class);
        bulbasaur.setMainAttack(mockedMainAttack);
        bulbasaur.setSecondAttack(mockedSecondAttack);
        bulbasaur.setType(mockedType);

    }

    @Test
    public void evolve () {
        assertNull(bulbasaur.evolve());
    }

    @Test
    public void defend() {
        assertEquals("Defending attack, damage caused is 5 new HP is 45",
                bulbasaur.defend(
                        mock(Thunder.class).getAttackDamage(),
                        mock(Electric.class)
                )
        );
        assertEquals(45, bulbasaur.getHitPoints());
    }

    @Test
    public void secondAttack() {
        assertEquals("Attacking opponent with Seed Bomb causing a damage of 80",
                bulbasaur.secondAttack());
    }

    @Test
    public void mainAttack() {
        assertEquals("Attacking opponent with Take Down causing a damage of 90",
                bulbasaur.mainAttack());
    }

    @Test
    public void newAttack(){
        bulbasaur.setNewAttack(1, mock(Confusion.class));
        assertEquals("Confusion", bulbasaur.getMainAttackName());
        bulbasaur.setNewAttack(2,  mock(FireBlast.class));
        assertEquals("Fire Blast", bulbasaur.getSecondAttackName());
    }


}
