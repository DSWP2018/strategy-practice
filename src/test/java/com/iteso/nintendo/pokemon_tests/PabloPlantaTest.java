package com.iteso.nintendo.pokemon_tests;

import com.iteso.nintendo.Type;
import com.iteso.nintendo.implementations.attack.Bubble;
import com.iteso.nintendo.implementations.pokemon.MiguelAcuatico;
import com.iteso.nintendo.implementations.pokemon.PabloPlanta;
import com.iteso.nintendo.implementations.type.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class PabloPlantaTest {
    PabloPlanta pabloPlanta;
    Type opponent;

    @Before
    public void setUp(){
        pabloPlanta = new PabloPlanta();
    }

    // Pablo should make more damage against an electric opponent
    // and have less defence
    @Test
    public void pabloVsElectric(){
        opponent = new Electric();
        pabloPlanta.getType().setOpponentType(opponent);

        assertTrue(pabloPlanta.getMainAttackDamage() > pabloPlanta.getMainAttack().getAttackDamage()
                            && pabloPlanta.getDefenseMultiplier() < 0.6);
    }

    // Pablo should make additional damage against a fire opponent
    // and have less defence
    @Test
    public void pabloVsFire(){
        opponent = new Fire();
        pabloPlanta.getType().setOpponentType(opponent);

        assertTrue(pabloPlanta.getMainAttackDamage() > pabloPlanta.getMainAttack().getAttackDamage()
                            && pabloPlanta.getDefenseMultiplier() < 0.6);
    }

    // Pablo should make additional damage against a normal opponent
    // and have more defence
    @Test
    public void pabloVsNormal(){
        opponent = new Normal();
        pabloPlanta.getType().setOpponentType(opponent);

        assertTrue(pabloPlanta.getMainAttackDamage() > pabloPlanta.getMainAttack().getAttackDamage()
                            && pabloPlanta.getDefenseMultiplier() > 0.6);
    }

    // Pablo should make the same damage against a plant opponent
    // and have the same defence
    @Test
    public void pabloVsPlant(){
        opponent = new Plant();
        pabloPlanta.getType().setOpponentType(opponent);

        assertTrue(pabloPlanta.getMainAttackDamage() == pabloPlanta.getMainAttack().getAttackDamage()
                            && pabloPlanta.getDefenseMultiplier() == 0.6);
    }

    // Pablo should make less damage against a water opponent
    // and have additional defence
    @Test
    public void pabloVsWater(){
        opponent = new Water();
        pabloPlanta.getType().setOpponentType(opponent);

        assertTrue(pabloPlanta.getMainAttackDamage() < pabloPlanta.getMainAttack().getAttackDamage()
                            && pabloPlanta.getDefenseMultiplier() > 0.6);
    }

    @Test
    public void hitPoints(){
        assertEquals(60, pabloPlanta.getHitPoints());
    }

    @Test
    public void checkType(){
        assertEquals("Plant", pabloPlanta.getType().getTypeName());
    }

    @Test
    public void checkMainAttack(){
        assertEquals("ImpactTrueno", pabloPlanta.getMainAttack().getNameAttack());
    }

    @Test
    public void checkSecondAttack(){
        assertEquals("BigFire", pabloPlanta.getSecondAttack().getNameAttack());
    }

    @Test
    public void defend(){
        int hpBeforeAttack = pabloPlanta.getHitPoints();
        pabloPlanta.getType().setOpponentType(new Electric());
        pabloPlanta.defend(10);
        assertTrue(hpBeforeAttack > pabloPlanta.getHitPoints());
    }

    @Test
    public void mainAttack(){
        Type opponent = new Water();
        pabloPlanta.getType().setOpponentType(opponent);
        String attack = "Attacking opponent with ImpactTrueno causing a damage of 13";

        assertEquals(attack, pabloPlanta.mainAttack());
    }

    @Test
    public void secondAttack(){
        Type opponent = new Water();
        pabloPlanta.getType().setOpponentType(opponent);
        String attack = "Attacking opponent with BigFire causing a damage of 15";

        assertEquals(attack, pabloPlanta.secondAttack());
    }

    @Test
    public void newAttack(){
        String nameAttack = pabloPlanta.getSecondAttack().getNameAttack();
        pabloPlanta.setNewAttack(new Bubble());
        assertFalse(nameAttack.equals(pabloPlanta.getSecondAttack().getNameAttack()));
    }
}
