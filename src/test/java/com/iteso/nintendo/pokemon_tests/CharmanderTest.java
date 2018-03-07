package com.iteso.nintendo.pokemon_tests;

import com.iteso.nintendo.Type;
import com.iteso.nintendo.implementations.attack.Bubble;
import com.iteso.nintendo.implementations.pokemon.AgustinFogoso;
import com.iteso.nintendo.implementations.pokemon.Charmander;
import com.iteso.nintendo.implementations.type.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class CharmanderTest {
    Charmander charmander;
    Type opponent;

    @Before
    public void setUp(){
        charmander = new Charmander();
    }

    // Charmander should make less damage against an electric opponent
    // and have more defence
    @Test
    public void charmanderVsElectric(){
        opponent = new Electric();
        charmander.getType().setOpponentType(opponent);

        assertTrue(charmander.getMainAttackDamage() < charmander.getMainAttack().getAttackDamage()
                            && charmander.getDefenseMultiplier() > 0.3);
    }

    // Charmander should make the same damage against a fire opponent
    // and have the same defence
    @Test
    public void charmanderVsFire(){
        opponent = new Fire();
        charmander.getType().setOpponentType(opponent);

        assertTrue(charmander.getMainAttackDamage() == charmander.getMainAttack().getAttackDamage()
                            && charmander.getDefenseMultiplier() == 0.3);
    }

    // Charmander should make additional damage against a normal opponent
    // and have more defence
    @Test
    public void charmanderVsNormal(){
        opponent = new Normal();
        charmander.getType().setOpponentType(opponent);

        assertTrue(charmander.getMainAttackDamage() > charmander.getMainAttack().getAttackDamage()
                            && charmander.getDefenseMultiplier() > 0.3);
    }

    // Charmander should make additional damage against a plant opponent
    // and have more defence
    @Test
    public void charmanderVsPlant(){
        opponent = new Plant();
        charmander.getType().setOpponentType(opponent);

        assertTrue(charmander.getMainAttackDamage() > charmander.getMainAttack().getAttackDamage()
                            && charmander.getDefenseMultiplier() > 0.3);
    }

    // Charmander make less damage against a water opponent
    // and have less defence
    @Test
    public void charmanderVsWater(){
        opponent = new Water();
        charmander.getType().setOpponentType(opponent);

        assertTrue(charmander.getMainAttackDamage() < charmander.getMainAttack().getAttackDamage()
                            && charmander.getDefenseMultiplier() < 0.3);
    }

    @Test
    public void hitPoints(){
        assertEquals(77, charmander.getHitPoints());
    }

    @Test
    public void checkType(){
        assertEquals("Fire", charmander.getType().getTypeName());
    }

    @Test
    public void checkMainAttack(){
        assertEquals("Small Fire", charmander.getMainAttack().getNameAttack());
    }

    @Test
    public void checkSecondAttack(){
        assertEquals("BigFire", charmander.getSecondAttack().getNameAttack());
    }

    @Test
    public void defend(){
        int hpBeforeAttack = charmander.getHitPoints();
        charmander.getType().setOpponentType(new Water());
        charmander.defend(20);
        assertTrue(hpBeforeAttack > charmander.getHitPoints());
    }

    @Test
    public void mainAttack(){
        Type opponent = new Fire();
        charmander.getType().setOpponentType(opponent);
        String attack = "Attacking opponent with Small Fire causing a damage of 3";

        assertEquals(attack, charmander.mainAttack());
    }

    @Test
    public void secondAttack(){
        Type opponent = new Fire();
        charmander.getType().setOpponentType(opponent);
        String attack = "Attacking opponent with BigFire causing a damage of 17";

        assertEquals(attack, charmander.secondAttack());
    }

    @Test
    public void newAttack(){
        String nameAttack = charmander.getSecondAttack().getNameAttack();
        charmander.setNewAttack(new Bubble());
        assertFalse(nameAttack.equals(charmander.getSecondAttack().getNameAttack()));
    }
}
