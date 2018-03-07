package com.iteso.nintendo.type_tests;

import com.iteso.nintendo.Type;
import com.iteso.nintendo.implementations.type.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlantTest {
    Plant plant;
    Type opponent;

    @Before
    public void setUp(){
        plant = new Plant();
    }

    @Test
    public void name(){
        assertEquals("Plant", plant.getTypeName());
    }

    @Test
    public void PlantVsFire(){
        opponent = new Fire();
        plant.setOpponentType(opponent);

        assertTrue(plant.attackDamageAffectedByType() == 3 && plant.defenseAffectedByType() == -0.3);
    }

    @Test
    public void PlantVsElectric(){
        opponent = new Electric();
        plant.setOpponentType(opponent);

        assertTrue(plant.attackDamageAffectedByType() == 1 && plant.defenseAffectedByType() == -0.1);
    }

    @Test
    public void PlantVsNormal(){
        opponent = new Normal();
        plant.setOpponentType(opponent);

        assertTrue(plant.attackDamageAffectedByType() == 4 && plant.defenseAffectedByType() == 0.1);
    }

    @Test
    public void PlantVsPlant(){
        opponent = new Plant();
        plant.setOpponentType(opponent);

        assertTrue(plant.attackDamageAffectedByType() == 0 && plant.defenseAffectedByType() == 0);
    }

    @Test
    public void PlantVsWater(){
        opponent = new Water();
        plant.setOpponentType(opponent);

        assertTrue(plant.attackDamageAffectedByType() == -2 && plant.defenseAffectedByType() == 0.2);
    }

}
