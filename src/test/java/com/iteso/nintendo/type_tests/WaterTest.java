package com.iteso.nintendo.type_tests;

import com.iteso.nintendo.Type;
import com.iteso.nintendo.implementations.type.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WaterTest {
    Water water;
    Type opponent;

    @Before
    public void setUp(){
        water = new Water();
    }

    @Test
    public void name(){
        assertEquals("Water", water.getTypeName());
    }

    @Test
    public void WaterVsFire(){
        opponent = new Fire();
        water.setOpponentType(opponent);

        assertTrue(water.attackDamageAffectedByType() == 4 && water.defenseAffectedByType() == 0.3);
    }

    @Test
    public void WaterVsElectric(){
        opponent = new Electric();
        water.setOpponentType(opponent);

        assertTrue(water.attackDamageAffectedByType() == 3 && water.defenseAffectedByType() == -0.2);
    }

    @Test
    public void WaterVsNormal(){
        opponent = new Normal();
        water.setOpponentType(opponent);

        assertTrue(water.attackDamageAffectedByType() == 2 && water.defenseAffectedByType() == 0.1);
    }

    @Test
    public void WaterVsPlant(){
        opponent = new Plant();
        water.setOpponentType(opponent);

        assertTrue(water.attackDamageAffectedByType() == -1 && water.defenseAffectedByType() == -0.1);
    }

    @Test
    public void WaterVsWater(){
        opponent = new Water();
        water.setOpponentType(opponent);

        assertTrue(water.attackDamageAffectedByType() == 0 && water.defenseAffectedByType() == 0);
    }

}
