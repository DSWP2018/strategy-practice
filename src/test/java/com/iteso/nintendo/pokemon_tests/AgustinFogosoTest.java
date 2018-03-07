package com.iteso.nintendo.pokemon_tests;

import com.iteso.nintendo.Type;
import com.iteso.nintendo.implementations.attack.Bubble;
import com.iteso.nintendo.implementations.pokemon.AgustinFogoso;
import com.iteso.nintendo.implementations.type.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class AgustinFogosoTest {
    AgustinFogoso agustinFogoso;
    Type opponent;

    @Before
    public void setUp(){
        agustinFogoso = new AgustinFogoso();
    }

    // Agustin should make less damage against an electric opponent
    // and have more defence
    @Test
    public void agustinVsElectric(){
        opponent = new Electric();
        agustinFogoso.getType().setOpponentType(opponent);

        assertTrue(agustinFogoso.getMainAttackDamage() < agustinFogoso.getMainAttack().getAttackDamage()
                            && agustinFogoso.getDefenseMultiplier() > 0.3);
    }

    // Agustin should make the same damage against a fire opponent
    // and have the same defence
    @Test
    public void agustinVsFire(){
        opponent = new Fire();
        agustinFogoso.getType().setOpponentType(opponent);

        assertTrue(agustinFogoso.getMainAttackDamage() == agustinFogoso.getMainAttack().getAttackDamage()
                            && agustinFogoso.getDefenseMultiplier() == 0.3);
    }

    // Agustin should make additional damage against a normal opponent
    // and have more defence
    @Test
    public void agustinVsNormal(){
        opponent = new Normal();
        agustinFogoso.getType().setOpponentType(opponent);

        assertTrue(agustinFogoso.getMainAttackDamage() > agustinFogoso.getMainAttack().getAttackDamage()
                            && agustinFogoso.getDefenseMultiplier() > 0.3);
    }

    // Agustin should make additional damage against a plant opponent
    // and have more defence
    @Test
    public void agustinVsPlant(){
        opponent = new Plant();
        agustinFogoso.getType().setOpponentType(opponent);

        assertTrue(agustinFogoso.getMainAttackDamage() > agustinFogoso.getMainAttack().getAttackDamage()
                            && agustinFogoso.getDefenseMultiplier() > 0.3);
    }

    // Agustin should make less damage against a water opponent
    // and have less defence
    @Test
    public void agustinVsWater(){
        opponent = new Water();
        agustinFogoso.getType().setOpponentType(opponent);

        assertTrue(agustinFogoso.getMainAttackDamage() < agustinFogoso.getMainAttack().getAttackDamage()
                            && agustinFogoso.getDefenseMultiplier() < 0.3);
    }

    @Test
    public void hitPoints(){
        assertEquals(80, agustinFogoso.getHitPoints());
    }

    @Test
    public void checkType(){
        assertEquals("Fire", agustinFogoso.getType().getTypeName());
    }

    @Test
    public void checkMainAttack(){
        assertEquals("Small Fire", agustinFogoso.getMainAttack().getNameAttack());
    }

    @Test
    public void checkSecondAttack(){
        assertEquals("BigFire", agustinFogoso.getSecondAttack().getNameAttack());
    }

    @Test
    public void defend(){
        int hpBeforeAttack = agustinFogoso.getHitPoints();
        agustinFogoso.getType().setOpponentType(new Water());
        agustinFogoso.defend(20);
        assertTrue(hpBeforeAttack > agustinFogoso.getHitPoints());
    }

    @Test
    public void mainAttack(){
        Type opponent = new Fire();
        agustinFogoso.getType().setOpponentType(opponent);
        String attack = "Attacking opponent with Small Fire causing a damage of 3";

        assertEquals(attack, agustinFogoso.mainAttack());
    }

    @Test
    public void secondAttack(){
        Type opponent = new Fire();
        agustinFogoso.getType().setOpponentType(opponent);
        String attack = "Attacking opponent with BigFire causing a damage of 17";

        assertEquals(attack, agustinFogoso.secondAttack());
    }

    @Test
    public void newAttack(){
        String nameAttack = agustinFogoso.getSecondAttack().getNameAttack();
        agustinFogoso.setNewAttack(new Bubble());
        assertFalse(nameAttack.equals(agustinFogoso.getSecondAttack().getNameAttack()));
    }
}
