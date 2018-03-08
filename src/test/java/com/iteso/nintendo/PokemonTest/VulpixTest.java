package com.iteso.nintendo.PokemonTest;

import com.iteso.nintendo.Moves.*;
import com.iteso.nintendo.Pokemon.Vulpix;
import com.iteso.nintendo.PokemonAttack;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.Types.Fire;
import com.iteso.nintendo.Types.Ground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by Carmen Martinez on 3/07/18.
 */
public class VulpixTest {
    Vulpix vulpix;
    PokemonAttack mockedMainAttack;
    PokemonAttack mockedSecondAttack;
    PokemonType mockedType;

    @Before
    public void setUp() {
        vulpix = new Vulpix();
        mockedMainAttack = mock(FireBlast.class);
        mockedSecondAttack = mock(Flamethrower.class);
        mockedType = mock(Fire.class);
        vulpix.setMainAttack(mockedMainAttack);
        vulpix.setSecondAttack(mockedSecondAttack);
        vulpix.setType(mockedType);

    }

    @Test
    public void evolve () {
        assertEquals("Vulpix is evolving into Ninetales", vulpix.evolve());
    }

    @Test
    public void defend() {
        assertEquals("Defending attack, damage caused is 72 new HP is 5",
                vulpix.defend(
                        mock(Thrash.class).getAttackDamage(),
                        mock(Ground.class)
                )
        );
        assertEquals(5, vulpix.getHitPoints());

    }

    @Test
    public void secondAttack() {
        assertEquals("Attacking opponent with Flamethrower causing a damage of 90",
                vulpix.secondAttack());
    }

    @Test
    public void mainAttack() {
        assertEquals("Attacking opponent with Fire Blast causing a damage of 110",
                vulpix.mainAttack());
    }

    @Test
    public void newAttack(){
        vulpix.setNewAttack(1, mock(FlameBurst.class));
        assertEquals("Flame Burst", vulpix.getMainAttackName());
        vulpix.setNewAttack(2,  mock(TakeDown.class));
        assertEquals("Take Down", vulpix.getSecondAttackName());
    }


}
