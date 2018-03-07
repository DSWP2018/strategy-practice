package com.iteso.nintendo.pokemon_tests;

import com.iteso.nintendo.Type;
import com.iteso.nintendo.implementations.attack.Bubble;
import com.iteso.nintendo.implementations.pokemon.JoseElectrico;
import com.iteso.nintendo.implementations.pokemon.Pikachu;
import com.iteso.nintendo.implementations.type.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class JoseElectricoTest {
    JoseElectrico joseElectrico;
    Type opponent;

    @Before
    public void setUp(){
        joseElectrico = new JoseElectrico();
    }

    // Jose should make the same damage against an electric opponent
    // and have the same defence
    @Test
    public void joseVsElectric(){
        opponent = new Electric();
        joseElectrico.getType().setOpponentType(opponent);

        assertTrue(joseElectrico.getMainAttackDamage() == joseElectrico.getMainAttack().getAttackDamage()
                            && joseElectrico.getDefenseMultiplier() == 0.1);
    }

    // Jose should make additional damage against a fire opponent
    // and have more defence
    @Test
    public void joseVsFire(){
        opponent = new Fire();
        joseElectrico.getType().setOpponentType(opponent);

        assertTrue(joseElectrico.getMainAttackDamage() > joseElectrico.getMainAttack().getAttackDamage()
                            && joseElectrico.getDefenseMultiplier() > 0.1);
    }

    // Jose should make additional damage against a normal opponent
    // and have less defence
    @Test
    public void joseVsNormal(){
        opponent = new Normal();
        joseElectrico.getType().setOpponentType(opponent);

        assertTrue(joseElectrico.getMainAttackDamage() > joseElectrico.getMainAttack().getAttackDamage()
                            && joseElectrico.getDefenseMultiplier() < 0.1);
    }

    // Jose should make additional damage against a plant opponent
    // and have more defence
    @Test
    public void joseVsPlant(){
        opponent = new Plant();
        joseElectrico.getType().setOpponentType(opponent);

        assertTrue(joseElectrico.getMainAttackDamage() > joseElectrico.getMainAttack().getAttackDamage()
                            && joseElectrico.getDefenseMultiplier() > 0.1);
    }

    // Jose should make less damage against a water opponent
    // and have less defence
    @Test
    public void joseVsWater(){
        opponent = new Water();
        joseElectrico.getType().setOpponentType(opponent);

        assertTrue(joseElectrico.getMainAttackDamage() < joseElectrico.getMainAttack().getAttackDamage()
                            && joseElectrico.getDefenseMultiplier() < 0.1);
    }

    @Test
    public void hitPoints(){
        assertEquals(120, joseElectrico.getHitPoints());
    }

    @Test
    public void checkType(){
        assertEquals("Electric", joseElectrico.getType().getTypeName());
    }

    @Test
    public void checkMainAttack(){
        assertEquals("QuickAttack", joseElectrico.getMainAttack().getNameAttack());
    }

    @Test
    public void checkSecondAttack(){
        assertEquals("ImpactTrueno", joseElectrico.getSecondAttack().getNameAttack());
    }

    @Test
    public void defend(){
        int hpBeforeAttack = joseElectrico.getHitPoints();
        joseElectrico.getType().setOpponentType(new Electric());
        joseElectrico.defend(10);
        assertTrue(hpBeforeAttack > joseElectrico.getHitPoints());
    }

    @Test
    public void mainAttack(){
        Type opponent = new Electric();
        joseElectrico.getType().setOpponentType(opponent);
        String attack = "Attacking opponent with QuickAttack causing a damage of 5";

        assertEquals(attack, joseElectrico.mainAttack());
    }

    @Test
    public void secondAttack(){
        Type opponent = new Electric();
        joseElectrico.getType().setOpponentType(opponent);
        String attack = "Attacking opponent with ImpactTrueno causing a damage of 15";

        assertEquals(attack, joseElectrico.secondAttack());
    }

    @Test
    public void newAttack(){
        String nameAttack = joseElectrico.getSecondAttack().getNameAttack();
        joseElectrico.setNewAttack(new Bubble());
        assertFalse(nameAttack.equals(joseElectrico.getSecondAttack().getNameAttack()));
    }
}
