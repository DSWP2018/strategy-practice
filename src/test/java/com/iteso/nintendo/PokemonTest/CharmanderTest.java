package com.iteso.nintendo.PokemonTest;

import com.iteso.nintendo.Moves.*;
import com.iteso.nintendo.Pokemon.Charmander;
import com.iteso.nintendo.Pokemon.Cubone;
import com.iteso.nintendo.PokemonAttack;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Electric;
import com.iteso.nintendo.Types.Fire;
import com.iteso.nintendo.Types.Ground;
import com.iteso.nintendo.Types.Water;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

/**
 * Created by Carmen Martinez on 3/07/18.
 */
public class CharmanderTest {
    Charmander charmander;
    PokemonAttack mockedMainAttack;
    PokemonAttack mockedSecondAttack;
    PokemonType mockedType;

    @Before
    public void setUp() {
        charmander = new Charmander();
        mockedMainAttack = mock(Flamethrower.class);
        mockedSecondAttack = mock(FlameBurst.class);
        mockedType = mock(Fire.class);
        charmander.setMainAttack(mockedMainAttack);
        charmander.setSecondAttack(mockedSecondAttack);
        charmander.setType(mockedType);

    }

    @Test
    public void evolve () {
        assertNull(charmander.evolve());
    }

    @Test
    public void defend() {
        assertEquals("Defending attack, damage caused is 45 new HP is 15",
                charmander.defend(
                        mock(StompingTantrum.class).getAttackDamage(),
                        mock(Ground.class)
                )
        );
        assertEquals(15, charmander.getHitPoints());

    }

    @Test
    public void secondAttack() {
        assertEquals("Attacking opponent with Flame Burst causing a damage of 70",
                charmander.secondAttack());
    }

    @Test
    public void mainAttack() {
        assertEquals("Attacking opponent with Flamethrower causing a damage of 90",
                charmander.mainAttack());
    }

    @Test
    public void newAttack(){
        charmander.setNewAttack(1, mock(Confusion.class));
        assertEquals("Confusion", charmander.getMainAttackName());
        charmander.setNewAttack(2,  mock(FireBlast.class));
        assertEquals("Fire Blast", charmander.getSecondAttackName());
    }


}
