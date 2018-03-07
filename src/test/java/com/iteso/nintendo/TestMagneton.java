package com.iteso.nintendo;

import com.iteso.nintendo.pokemons.PokemonCharacter;
import com.iteso.nintendo.pokemons.types.Type;
import com.iteso.nintendo.pokemons.types.electric.Magnemite;
import com.iteso.nintendo.pokemons.types.electric.Pikachu;
import com.iteso.nintendo.pokemons.types.electric.Raichu;
import com.iteso.nintendo.pokemons.types.fire.Charizard;
import com.iteso.nintendo.pokemons.types.fire.Charmander;
import com.iteso.nintendo.pokemons.types.fire.Charmeleon;
import com.iteso.nintendo.pokemons.types.electric.Magneton;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class TestMagneton {
    Magneton magneton;
    Raichu raichu;
    Magnemite magnemite;
    Pikachu pikachu;
    Charizard charizard;
    Charmander charmander;
    Charmeleon charmeleon;
    PokemonCharacter mockedAttacker;

    @Before
    public void setUp() {
        magneton = new Magneton();
        raichu = new Raichu();
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
        System.out.println(magneton.mainAttack(pikachu));
        System.out.println(magneton.secondAttack(pikachu));
        assertTrue(pikachu.getHitPoints()>=0);
    }

    @Test
    public void testAttackRaichu() {
        System.out.println(magneton.mainAttack(raichu));
        System.out.println(magneton.secondAttack(raichu));
        assertTrue(raichu.getHitPoints()>=0);
    }

    @Test
    public void testAttackMagnemite() {
        System.out.println(magneton.mainAttack(magnemite));
        System.out.println(magneton.secondAttack(magnemite));
        assertTrue(magnemite.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharizard() {
        System.out.println(magneton.mainAttack(charizard));
        System.out.println(magneton.secondAttack(charizard));
        assertTrue(charizard.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharmander() {
        System.out.println(magneton.mainAttack(charmander));
        System.out.println(magneton.secondAttack(charmander));
        assertTrue(charmander.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharmeleon() {
        System.out.println(magneton.mainAttack(charmeleon));
        System.out.println(magneton.secondAttack(charmeleon));
        assertTrue(charmeleon.getHitPoints()>=0);
    }

    @Test
    public void testDefense() {
        System.out.println(magneton.defend(mockedAttacker,10));
        assertTrue(magneton.getHitPoints()>=0);
    }
}
