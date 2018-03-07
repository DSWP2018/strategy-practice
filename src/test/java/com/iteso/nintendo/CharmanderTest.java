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

public class CharmanderTest {
    Charmander charmander;
    Raichu raichu;
    Magneton magneton;
    Pikachu pikachu;
    Magnemite magnemite;
    Charizard charizard;
    Charmeleon charmeleon;
    PokemonCharacter mockedAttacker;

    @Before
    public void setUp() {
        charmander = new Charmander();
        raichu = new Raichu();
        magneton = new Magneton();
        pikachu = new Pikachu();
        magnemite = new Magnemite();
        charizard = new Charizard();
        charmeleon = new Charmeleon();
        mockedAttacker = mock(PokemonCharacter.class);
        mockedAttacker.setType(mock(Type.class));
    }

    @Test
    public void testAttackPikachu() {
        System.out.println(charmander.mainAttack(pikachu));
        System.out.println(charmander.secondAttack(pikachu));
        assertTrue(pikachu.getHitPoints()>=0);
    }

    @Test
    public void testAttackRaichu() {
        System.out.println(charmander.mainAttack(raichu));
        System.out.println(charmander.secondAttack(raichu));
        assertTrue(raichu.getHitPoints()>=0);
    }

    @Test
    public void testAttackMagneton() {
        System.out.println(charmander.mainAttack(magneton));
        System.out.println(charmander.secondAttack(magneton));
        assertTrue(magneton.getHitPoints()>=0);
    }

    @Test
    public void testAttackMagnemite() {
        System.out.println(charmander.mainAttack(magnemite));
        System.out.println(charmander.secondAttack(magnemite));
        assertTrue(magnemite.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharizard() {
        System.out.println(charmander.mainAttack(charizard));
        System.out.println(charmander.secondAttack(charizard));
        assertTrue(charizard.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharmeleon() {
        System.out.println(charmander.mainAttack(charmeleon));
        System.out.println(charmander.secondAttack(charmeleon));
        assertTrue(charmeleon.getHitPoints()>=0);
    }

    @Test
    public void testDefense() {
        System.out.println(charmander.defend(mockedAttacker,10));
        assertTrue(charmander.getHitPoints()>=0);
    }
}
