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

public class CharizardTest {
    Charizard charizard;
    Raichu raichu;
    Magneton magneton;
    Pikachu pikachu;
    Magnemite magnemite;
    Charmander charmander;
    Charmeleon charmeleon;
    PokemonCharacter mockedAttacker;

    @Before
    public void setUp() {
        charizard = new Charizard();
        raichu = new Raichu();
        magneton = new Magneton();
        pikachu = new Pikachu();
        magnemite = new Magnemite();
        charmander = new Charmander();
        charmeleon = new Charmeleon();
        mockedAttacker = mock(PokemonCharacter.class);
        mockedAttacker.setType(mock(Type.class));
    }

    @Test
    public void testAttackPikachu() {
        System.out.println(charizard.mainAttack(pikachu));
        System.out.println(charizard.secondAttack(pikachu));
        assertTrue(pikachu.getHitPoints()>=0);
    }

    @Test
    public void testAttackRaichu() {
        System.out.println(charizard.mainAttack(raichu));
        System.out.println(charizard.secondAttack(raichu));
        assertTrue(raichu.getHitPoints()>=0);
    }

    @Test
    public void testAttackMagneton() {
        System.out.println(charizard.mainAttack(magneton));
        System.out.println(charizard.secondAttack(magneton));
        assertTrue(magneton.getHitPoints()>=0);
    }

    @Test
    public void testAttackMagnemite() {
        System.out.println(charizard.mainAttack(magnemite));
        System.out.println(charizard.secondAttack(magnemite));
        assertTrue(magnemite.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharmander() {
        System.out.println(charizard.mainAttack(charmander));
        System.out.println(charizard.secondAttack(charmander));
        assertTrue(charmander.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharmeleon() {
        System.out.println(charizard.mainAttack(charmeleon));
        System.out.println(charizard.secondAttack(charmeleon));
        assertTrue(charmeleon.getHitPoints()>=0);
    }

    @Test
    public void testDefense() {
        System.out.println(charizard.defend(mockedAttacker,10));
        assertTrue(charizard.getHitPoints()>=0);
    }
}
