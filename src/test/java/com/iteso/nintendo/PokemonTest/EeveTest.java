package com.iteso.nintendo.PokemonTest;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.PokemonCharacter;
import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.impl.attacks.Acid;
import com.iteso.nintendo.impl.attacks.ElectroBall;
import com.iteso.nintendo.impl.attacks.Thunder;
import com.iteso.nintendo.pokemon.Cyndaquil;
import com.iteso.nintendo.pokemon.Eevee;
import com.iteso.nintendo.types.Electric;
import com.iteso.nintendo.types.Normal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;

public class EeveTest {
    @Mock
    PokemonCharacter pokemon;
    Electric electricMocked;
    ElectroBall electroBallMocked;
    Thunder thunderMocked;


    @Before
    public void setUp(){
        pokemon = new Eevee();
        electricMocked = mock(Electric.class);
        electroBallMocked = mock(ElectroBall.class);
        thunderMocked = mock(Thunder.class);
        pokemon.setType(electricMocked);
        pokemon.setMainAttack(electroBallMocked);
        pokemon.setSecondAttack(thunderMocked);
    }

    @Test
    public void getNameTest(){
        Assert.assertEquals("Eevee", pokemon.getName());
    }

    @Test
    public void setNameTest(){
        pokemon.setName("Bulbasaur2");
        Assert.assertEquals("Bulbasaur2", pokemon.getName());
        pokemon.setName("Eevee");
        Assert.assertEquals("Eevee", pokemon.getName());
    }

    @Test
    public void evolveTest(){
        Assert.assertEquals(null, pokemon.evolve());
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Electric", pokemon.getType());
    }

    @Test
    public void setTypeTest(){
        PokemonType normalMocked = mock(Normal.class);
        pokemon.setType(normalMocked);
        Assert.assertEquals("Normal",pokemon.getType());
        electricMocked = mock(Electric.class);
        pokemon.setType(electricMocked);
    }

    @Test
    public void defend() {
        Assert.assertEquals("Defending attack, damage caused is 5 new HP is 95", pokemon.defend(10));
        Assert.assertEquals(95, pokemon.getHitPoints());
    }

    @Test
    public void isHasEvolutionTest(){
        Assert.assertEquals(true, pokemon.isHasEvolution());
    }

    @Test
    public void setHasEvolutionTest(){
        pokemon.setHasEvolution(false);
        Assert.assertEquals(false, pokemon.isHasEvolution());
        pokemon.setHasEvolution(true);
        Assert.assertEquals(true, pokemon.isHasEvolution());
    }

    @Test
    public void getAndSetMainAttackTest(){
        Attack newMockedMainAttack = mock(Acid.class);
        pokemon.setMainAttack(newMockedMainAttack);
        Assert.assertEquals("Acid", pokemon.getMainAttack());
    }

    @Test
    public void getAndSetSecondAttackTest(){
        Attack newMockedMainAttack = mock(Acid.class);
        pokemon.setSecondAttack(newMockedMainAttack);
        Assert.assertEquals("Acid", pokemon.getSecondAttack());
    }




}
