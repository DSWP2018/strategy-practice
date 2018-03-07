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

public class TestRaichu {
    Raichu raichu;
    Magneton magneton;
    Magnemite magnemite;
    Pikachu pikachu;
    Charizard charizard;
    Charmander charmander;
    Charmeleon charmeleon;
    PokemonCharacter mockedAttacker;

    @Before
    public void setUp() {
        raichu = new Raichu();
        magneton = new Magneton();
        magnemite = new Magnemite();
        pikachu = new Pikachu();
        charizard = new Charizard();
        charmander = new Charmander();
        charmeleon = new Charmeleon();
        mockedAttacker = mock(PokemonCharacter.class);
        mockedAttacker.setType(mock(Type.class));
    }

    @Test
    public void testAttackPikachu() {
        System.out.println(raichu.mainAttack(pikachu));
        System.out.println(raichu.secondAttack(pikachu));
        assertTrue(pikachu.getHitPoints()>=0);
    }

    @Test
    public void testAttackMagneton() {
        System.out.println(raichu.mainAttack(magneton));
        System.out.println(raichu.secondAttack(magneton));
        assertTrue(magneton.getHitPoints()>=0);
    }

    @Test
    public void testAttackMagnemite() {
        System.out.println(raichu.mainAttack(magnemite));
        System.out.println(raichu.secondAttack(magnemite));
        assertTrue(magnemite.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharizard() {
        System.out.println(raichu.mainAttack(charizard));
        System.out.println(raichu.secondAttack(charizard));
        assertTrue(charizard.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharmander() {
        System.out.println(raichu.mainAttack(charmander));
        System.out.println(raichu.secondAttack(charmander));
        assertTrue(charmander.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharmeleon() {
        System.out.println(raichu.mainAttack(charmeleon));
        System.out.println(raichu.secondAttack(charmeleon));
        assertTrue(charmeleon.getHitPoints()>=0);
    }

    @Test
    public void testDefense() {
        System.out.println(raichu.defend(mockedAttacker,10));
        assertTrue(raichu.getHitPoints()>=0);
    }
}
