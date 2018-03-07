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
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class PikachuTest {
    Pikachu pikachu;
    Raichu raichu;
    Magneton magneton;
    Magnemite magnemite;
    Charizard charizard;
    Charmander charmander;
    Charmeleon charmeleon;
    PokemonCharacter mockedAttacker;

    @Before
    public void setUp() {
    	pikachu = new Pikachu();
    	raichu = new Raichu();
    	magneton = new Magneton();
    	magnemite = new Magnemite();
    	charizard = new Charizard();
    	charmander = new Charmander();
    	charmeleon = new Charmeleon();
    	mockedAttacker = mock(PokemonCharacter.class);
    	mockedAttacker.setType(mock(Type.class));
    }

    @Test
    public void testAttackRaichu() {
        System.out.println(pikachu.mainAttack(raichu));
        System.out.println(pikachu.secondAttack(raichu));
        assertTrue(raichu.getHitPoints()>=0);
    }

    @Test
    public void testAttackMagneton() {
        System.out.println(pikachu.mainAttack(magneton));
        System.out.println(pikachu.secondAttack(magneton));
        assertTrue(magneton.getHitPoints()>=0);
    }

    @Test
    public void testAttackMagnemite() {
        System.out.println(pikachu.mainAttack(magnemite));
        System.out.println(pikachu.secondAttack(magnemite));
        assertTrue(magnemite.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharizard() {
        System.out.println(pikachu.mainAttack(charizard));
        System.out.println(pikachu.secondAttack(charizard));
        assertTrue(charizard.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharmander() {
        System.out.println(pikachu.mainAttack(charmander));
        System.out.println(pikachu.secondAttack(charmander));
        assertTrue(charmander.getHitPoints()>=0);
    }

    @Test
    public void testAttackCharmeleon() {
        System.out.println(pikachu.mainAttack(charmeleon));
        System.out.println(pikachu.secondAttack(charmeleon));
        assertTrue(charmeleon.getHitPoints()>=0);
    }

    @Test
    public void testDefense() {
        System.out.println(pikachu.defend(mockedAttacker,10));
        assertTrue(pikachu.getHitPoints()>=0);
    }
}
