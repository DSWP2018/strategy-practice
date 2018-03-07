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

public class CharmeleonTest {
    Charmeleon charmeleon;
    Raichu raichu;
    Magneton magneton;
    Pikachu pikachu;
    Magnemite magnemite;
    Charizard charizard;
    Charmander charmander;
    PokemonCharacter mockedAttacker;

    @Before
    public void setUp() {
        charmeleon = new Charmeleon();
        raichu = new Raichu();
        magneton = new Magneton();
        pikachu = new Pikachu();
        magnemite = new Magnemite();
        charizard = new Charizard();
        charmander = new Charmander();
        mockedAttacker = mock(PokemonCharacter.class);
        mockedAttacker.setType(mock(Type.class));
    }

    @Test
    public void testAttackPikachu() {
        System.out.println(charmeleon.mainAttack(pikachu));
        System.out.println(charmeleon.secondAttack(pikachu));
        assertTrue(pikachu.getHitPoints()>=0);
    }

    @Test
    public void testAttackRaichu() {
        System.out.println(charmeleon.mainAttack(raichu));
        System.out.println(charmeleon.secondAttack(raichu));
        assertTrue(raichu.getHitPoints()>=0);
    }

    @Test
    public void testAttackMagneton() {
        System.out.println(charmeleon.mainAttack(magneton));
        System.out.println(charmeleon.secondAttack(magneton));
        assertTrue(magneton.getHitPoints()>=0);
    }

    @Test
    public void testAttackMagnemite() {
        System.out.println(charmeleon.mainAttack(magnemite));
        System.out.println(charmeleon.secondAttack(magnemite));
        assertTrue(magnemite.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharizard() {
        System.out.println(charmeleon.mainAttack(charizard));
        System.out.println(charmeleon.secondAttack(charizard));
        assertTrue(charizard.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharmander() {
        System.out.println(charmeleon.mainAttack(charmander));
        System.out.println(charmeleon.secondAttack(charmander));
        assertTrue(charmander.getHitPoints()>=0);
    }

    @Test
    public void testDefense() {
        System.out.println(charmeleon.defend(mockedAttacker,10));
        assertTrue(charmeleon.getHitPoints()>=0);
    }
}
