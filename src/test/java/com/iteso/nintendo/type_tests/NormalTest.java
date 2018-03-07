package com.iteso.nintendo.type_tests;

import com.iteso.nintendo.Type;
import com.iteso.nintendo.implementations.type.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NormalTest {
    Normal normal;
    Type opponent;

    @Before
    public void setUp(){
        normal = new Normal();
    }

    @Test
    public void name(){
        assertEquals("Normal", normal.getTypeName());
    }

    @Test
    public void NormalVsFire(){
        opponent = new Fire();
        normal.setOpponentType(opponent);

        assertTrue(normal.attackDamageAffectedByType() == 4 && normal.defenseAffectedByType() == -0.2);
    }

    @Test
    public void NormalVsElectric(){
        opponent = new Electric();
        normal.setOpponentType(opponent);

        assertTrue(normal.attackDamageAffectedByType() == 2 && normal.defenseAffectedByType() == -0.1);
    }

    @Test
    public void NormalVsNormal(){
        opponent = new Normal();
        normal.setOpponentType(opponent);

        assertTrue(normal.attackDamageAffectedByType() == 0 && normal.defenseAffectedByType() == 0);
    }

    @Test
    public void NormalVsPlant(){
        opponent = new Plant();
        normal.setOpponentType(opponent);

        assertTrue(normal.attackDamageAffectedByType() == 6 && normal.defenseAffectedByType() == 0.1);
    }

    @Test
    public void NormalVsWater(){
        opponent = new Water();
        normal.setOpponentType(opponent);

        assertTrue(normal.attackDamageAffectedByType() == 5 && normal.defenseAffectedByType() == 0.1);
    }

}
