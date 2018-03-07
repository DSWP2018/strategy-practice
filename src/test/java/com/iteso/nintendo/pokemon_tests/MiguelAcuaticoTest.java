package com.iteso.nintendo.pokemon_tests;

import com.iteso.nintendo.Type;
import com.iteso.nintendo.implementations.attack.Bubble;
import com.iteso.nintendo.implementations.pokemon.JoseElectrico;
import com.iteso.nintendo.implementations.pokemon.MiguelAcuatico;
import com.iteso.nintendo.implementations.type.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class MiguelAcuaticoTest {
    MiguelAcuatico miguelAcuatico;
    Type opponent;

    @Before
    public void setUp(){
        miguelAcuatico = new MiguelAcuatico();
    }

    // Miguel should make more damage against an electric opponent
    // and have less defence
    @Test
    public void miguelVsElectric(){
        opponent = new Electric();
        miguelAcuatico.getType().setOpponentType(opponent);

        assertTrue(miguelAcuatico.getMainAttackDamage() > miguelAcuatico.getMainAttack().getAttackDamage()
                            && miguelAcuatico.getDefenseMultiplier() < 0.4);
    }

    // Miguel should make additional damage against a fire opponent
    // and have more defence
    @Test
    public void miguelVsFire(){
        opponent = new Fire();
        miguelAcuatico.getType().setOpponentType(opponent);

        assertTrue(miguelAcuatico.getMainAttackDamage() > miguelAcuatico.getMainAttack().getAttackDamage()
                            && miguelAcuatico.getDefenseMultiplier() > 0.4);
    }

    // Miguel should make additional damage against a normal opponent
    // and have more defence
    @Test
    public void miguelVsNormal(){
        opponent = new Normal();
        miguelAcuatico.getType().setOpponentType(opponent);

        assertTrue(miguelAcuatico.getMainAttackDamage() > miguelAcuatico.getMainAttack().getAttackDamage()
                            && miguelAcuatico.getDefenseMultiplier() > 0.4);
    }

    // Miguel should make less damage against a plant opponent
    // and have less defence
    @Test
    public void miguelVsPlant(){
        opponent = new Plant();
        miguelAcuatico.getType().setOpponentType(opponent);

        assertTrue(miguelAcuatico.getMainAttackDamage() < miguelAcuatico.getMainAttack().getAttackDamage()
                            && miguelAcuatico.getDefenseMultiplier() < 0.4);
    }

    // Miguel should make the same damage against a water opponent
    // and have the same defence
    @Test
    public void miguelVsWater(){
        opponent = new Water();
        miguelAcuatico.getType().setOpponentType(opponent);

        assertTrue(miguelAcuatico.getMainAttackDamage() == miguelAcuatico.getMainAttack().getAttackDamage()
                            && miguelAcuatico.getDefenseMultiplier() == 0.4);
    }

    @Test
    public void hitPoints(){
        assertEquals(100, miguelAcuatico.getHitPoints());
    }

    @Test
    public void checkType(){
        assertEquals("Water", miguelAcuatico.getType().getTypeName());
    }

    @Test
    public void checkMainAttack(){
        assertEquals("Bubble", miguelAcuatico.getMainAttack().getNameAttack());
    }

    @Test
    public void checkSecondAttack(){
        assertEquals("ImpactTrueno", miguelAcuatico.getSecondAttack().getNameAttack());
    }

    @Test
    public void defend(){
        int hpBeforeAttack = miguelAcuatico.getHitPoints();
        miguelAcuatico.getType().setOpponentType(new Electric());
        miguelAcuatico.defend(10);
        assertTrue(hpBeforeAttack > miguelAcuatico.getHitPoints());
    }

    @Test
    public void mainAttack(){
        Type opponent = new Water();
        miguelAcuatico.getType().setOpponentType(opponent);
        String attack = "Attacking opponent with Bubble causing a damage of 7";

        assertEquals(attack, miguelAcuatico.mainAttack());
    }

    @Test
    public void secondAttack(){
        Type opponent = new Water();
        miguelAcuatico.getType().setOpponentType(opponent);
        String attack = "Attacking opponent with ImpactTrueno causing a damage of 15";

        assertEquals(attack, miguelAcuatico.secondAttack());
    }

    @Test
    public void newAttack(){
        String nameAttack = miguelAcuatico.getSecondAttack().getNameAttack();
        miguelAcuatico.setNewAttack(new Bubble());
        assertFalse(nameAttack.equals(miguelAcuatico.getSecondAttack().getNameAttack()));
    }
}
