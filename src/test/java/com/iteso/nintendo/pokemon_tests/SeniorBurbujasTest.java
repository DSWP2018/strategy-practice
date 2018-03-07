package com.iteso.nintendo.pokemon_tests;

import com.iteso.nintendo.Type;
import com.iteso.nintendo.implementations.attack.Bubble;
import com.iteso.nintendo.implementations.pokemon.PabloPlanta;
import com.iteso.nintendo.implementations.pokemon.SeniorBurbujas;
import com.iteso.nintendo.implementations.type.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class SeniorBurbujasTest {
    SeniorBurbujas seniorBurbujas;
    Type opponent;

    @Before
    public void setUp(){
        seniorBurbujas = new SeniorBurbujas();
    }

    // Senior B should make more damage against an electric opponent
    // and have less defence
    @Test
    public void seniorVsElectric(){
        opponent = new Electric();
        seniorBurbujas.getType().setOpponentType(opponent);

        assertTrue(seniorBurbujas.getMainAttackDamage() > seniorBurbujas.getMainAttack().getAttackDamage()
                            && seniorBurbujas.getDefenseMultiplier() < 0.3);
    }

    // Senior B should make additional damage against a fire opponent
    // and have less defence
    @Test
    public void seniorVsFire(){
        opponent = new Fire();
        seniorBurbujas.getType().setOpponentType(opponent);

        assertTrue(seniorBurbujas.getMainAttackDamage() > seniorBurbujas.getMainAttack().getAttackDamage()
                            && seniorBurbujas.getDefenseMultiplier() < 0.3);
    }

    // Senior B should make the same damage against a normal opponent
    // and have the same defence
    @Test
    public void seniorVsNormal(){
        opponent = new Normal();
        seniorBurbujas.getType().setOpponentType(opponent);

        assertTrue(seniorBurbujas.getMainAttackDamage() == seniorBurbujas.getMainAttack().getAttackDamage()
                            && seniorBurbujas.getDefenseMultiplier() == 0.3);
    }

    // Senior B should make more damage against a plant opponent
    // and have additional defence
    @Test
    public void seniorVsPlant(){
        opponent = new Plant();
        seniorBurbujas.getType().setOpponentType(opponent);

        assertTrue(seniorBurbujas.getMainAttackDamage() > seniorBurbujas.getMainAttack().getAttackDamage()
                            && seniorBurbujas.getDefenseMultiplier() > 0.3);
    }

    // Senior B should make more damage against a water opponent
    // and have additional defence
    @Test
    public void seniorVsWater(){
        opponent = new Water();
        seniorBurbujas.getType().setOpponentType(opponent);

        assertTrue(seniorBurbujas.getMainAttackDamage() > seniorBurbujas.getMainAttack().getAttackDamage()
                            && seniorBurbujas.getDefenseMultiplier() > 0.3);
    }

    @Test
    public void hitPoints(){
        assertEquals(70, seniorBurbujas.getHitPoints());
    }

    @Test
    public void checkType(){
        assertEquals("Normal", seniorBurbujas.getType().getTypeName());
    }

    @Test
    public void checkMainAttack(){
        assertEquals("Bubble", seniorBurbujas.getMainAttack().getNameAttack());
    }

    @Test
    public void checkSecondAttack(){
        assertEquals("BigFire", seniorBurbujas.getSecondAttack().getNameAttack());
    }

    @Test
    public void defend(){
        int hpBeforeAttack = seniorBurbujas.getHitPoints();
        seniorBurbujas.getType().setOpponentType(new Electric());
        seniorBurbujas.defend(10);
        assertTrue(hpBeforeAttack > seniorBurbujas.getHitPoints());
    }

    @Test
    public void mainAttack(){
        Type opponent = new Water();
        seniorBurbujas.getType().setOpponentType(opponent);
        String attack = "Attacking opponent with Bubble causing a damage of 12";

        assertEquals(attack, seniorBurbujas.mainAttack());
    }

    @Test
    public void secondAttack(){
        Type opponent = new Water();
        seniorBurbujas.getType().setOpponentType(opponent);
        String attack = "Attacking opponent with BigFire causing a damage of 22";

        assertEquals(attack, seniorBurbujas.secondAttack());
    }

    @Test
    public void newAttack(){
        String nameAttack = seniorBurbujas.getSecondAttack().getNameAttack();
        seniorBurbujas.setNewAttack(new Bubble());
        assertFalse(nameAttack.equals(seniorBurbujas.getSecondAttack().getNameAttack()));
    }
}
