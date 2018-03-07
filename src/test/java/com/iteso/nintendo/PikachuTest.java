package com.iteso.nintendo;

import com.iteso.nintendo.implementations.attack.Bubble;
import com.iteso.nintendo.implementations.pokemon.Pikachu;
import com.iteso.nintendo.implementations.type.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class PikachuTest {
    Pikachu pikachu;
    Type opponent;

    @Before
    public void setUp(){
        pikachu = new Pikachu();
    }

    // Pikachu should make the same damage against an electric opponent
    // and have the same defence
    @Test
    public void pikachuVsElectric(){
        opponent = new Electric();
        pikachu.getType().setOpponentType(opponent);

        assertTrue(pikachu.getMainAttackDamage() == pikachu.getMainAttack().getAttackDamage()
                            && pikachu.getDefenseMultiplier() == 0.4);
    }

    // Pikachu should make aditional damage against a fire opponent
    // and have more defence
    @Test
    public void pikachuVsFire(){
        opponent = new Fire();
        pikachu.getType().setOpponentType(opponent);

        assertTrue(pikachu.getMainAttackDamage() > pikachu.getMainAttack().getAttackDamage()
                            && pikachu.getDefenseMultiplier() > 0.4);
    }

    // Pikachu should make aditional damage against a normal opponent
    // and have less defence
    @Test
    public void pikachuVsNormal(){
        opponent = new Normal();
        pikachu.getType().setOpponentType(opponent);

        assertTrue(pikachu.getMainAttackDamage() > pikachu.getMainAttack().getAttackDamage()
                            && pikachu.getDefenseMultiplier() < 0.4);
    }

    // Pikachu should make aditional damage against a plant opponent
    // and have more defence
    @Test
    public void pikachuVsPlant(){
        opponent = new Plant();
        pikachu.getType().setOpponentType(opponent);

        assertTrue(pikachu.getMainAttackDamage() > pikachu.getMainAttack().getAttackDamage()
                            && pikachu.getDefenseMultiplier() > 0.4);
    }

    // Pikachu should damage less against a water opponent
    // and have less defence
    @Test
    public void pikachuVsWater(){
        opponent = new Water();
        pikachu.getType().setOpponentType(opponent);

        assertTrue(pikachu.getMainAttackDamage() < pikachu.getMainAttack().getAttackDamage()
                            && pikachu.getDefenseMultiplier() < 0.4);
    }

    @Test
    public void hitPoints(){
        assertEquals(100, pikachu.getHitPoints());
    }

    @Test
    public void checkType(){
        assertEquals("Electric", pikachu.getType().getTypeName());
    }

    @Test
    public void checkMainAttack(){
        assertEquals("QuickAttack", pikachu.getMainAttack().getNameAttack());
    }

    @Test
    public void checkSecondAttack(){
        assertEquals("ImpactTrueno", pikachu.getSecondAttack().getNameAttack());
    }

    @Test
    public void defend(){
        int hpBeforeAttack = pikachu.getHitPoints();
        pikachu.getType().setOpponentType(new Water());
        pikachu.defend(10);
        assertTrue(hpBeforeAttack > pikachu.getHitPoints());
    }

    @Test
    public void mainAttack(){
        Type opponent = new Electric();
        pikachu.getType().setOpponentType(opponent);
        String attack = "Attacking opponent with QuickAttack causing a damage of 5";

        assertEquals(attack, pikachu.mainAttack());
    }

    @Test
    public void secondAttack(){
        Type opponent = new Electric();
        pikachu.getType().setOpponentType(opponent);
        String attack = "Attacking opponent with ImpactTrueno causing a damage of 15";

        assertEquals(attack, pikachu.secondAttack());
    }

    @Test
    public void newAttack(){
        String nameAttack = pikachu.getSecondAttack().getNameAttack();
        pikachu.setNewAttack(new Bubble());
        assertFalse(nameAttack.equals(pikachu.getSecondAttack().getNameAttack()));
    }
}
