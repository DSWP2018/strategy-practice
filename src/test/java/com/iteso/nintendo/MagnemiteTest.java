package com.iteso.nintendo;

import com.iteso.nintendo.pokemons.PokemonCharacter;
import com.iteso.nintendo.pokemons.types.Type;
import com.iteso.nintendo.pokemons.types.electric.Magnemite;
import com.iteso.nintendo.pokemons.types.electric.Magneton;
import com.iteso.nintendo.pokemons.types.electric.Pikachu;
import com.iteso.nintendo.pokemons.types.electric.Raichu;
import com.iteso.nintendo.pokemons.types.fire.Charizard;
import com.iteso.nintendo.pokemons.types.fire.Charmander;
import com.iteso.nintendo.pokemons.types.fire.Charmeleon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class MagnemiteTest {
    Magnemite magnemite;
    Raichu raichu;
    Magneton magneton;
    Pikachu pikachu;
    Charizard charizard;
    Charmander charmander;
    Charmeleon charmeleon;
    PokemonCharacter mockedAttacker;

    @Before
    public void setUp() {
        magnemite = new Magnemite();
        raichu = new Raichu();
        magneton = new Magneton();
        pikachu = new Pikachu();
        charizard = new Charizard();
        charmander = new Charmander();
        charmeleon = new Charmeleon();
        mockedAttacker = mock(PokemonCharacter.class);
        mockedAttacker.setType(mock(Type.class));
    }

    @Test
    public void testAttackPikachu() {
        System.out.println(magnemite.mainAttack(pikachu));
        System.out.println(magnemite.secondAttack(pikachu));
        assertTrue(pikachu.getHitPoints()>=0);
    }

    @Test
    public void testAttackRaichu() {
        System.out.println(magnemite.mainAttack(raichu));
        System.out.println(magnemite.secondAttack(raichu));
        assertTrue(raichu.getHitPoints()>=0);
    }

    @Test
    public void testAttackMagneton() {
        System.out.println(magnemite.mainAttack(magneton));
        System.out.println(magnemite.secondAttack(magneton));
        assertTrue(magneton.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharizard() {
        System.out.println(magnemite.mainAttack(charizard));
        System.out.println(magnemite.secondAttack(charizard));
        assertTrue(charizard.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharmander() {
        System.out.println(magnemite.mainAttack(charmander));
        System.out.println(magnemite.secondAttack(charmander));
        assertTrue(charmander.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharmeleon() {
        System.out.println(magnemite.mainAttack(charmeleon));
        System.out.println(magnemite.secondAttack(charmeleon));
        assertTrue(charmeleon.getHitPoints()>=0);
    }

    @Test
    public void testDefense() {
        System.out.println(magnemite.defend(mockedAttacker,10));
        assertTrue(magnemite.getHitPoints()>=0);
    }
}
