package com.iteso.nintendo.type_tests;

import com.iteso.nintendo.Type;
import com.iteso.nintendo.implementations.type.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ElectricTest {
    Electric electric;
    Type opponent;

    @Before
    public void setUp(){
        electric = new Electric();
    }

    @Test
    public void name(){
        assertEquals("Electric", electric.getTypeName());
    }

    @Test
    public void ElectricVsFire(){
        opponent = new Fire();
        electric.setOpponentType(opponent);

        assertTrue(electric.attackDamageAffectedByType() == 2 && electric.defenseAffectedByType() == 0.3);
    }

    @Test
    public void ElectricVsElectric(){
        opponent = new Electric();
        electric.setOpponentType(opponent);

        assertTrue(electric.attackDamageAffectedByType() == 0 && electric.defenseAffectedByType() == 0);
    }

    @Test
    public void ElectricVsNormal(){
        opponent = new Normal();
        electric.setOpponentType(opponent);

        assertTrue(electric.attackDamageAffectedByType() == 5 && electric.defenseAffectedByType() == -0.1);
    }

    @Test
    public void ElectricVsPlant(){
        opponent = new Plant();
        electric.setOpponentType(opponent);

        assertTrue(electric.attackDamageAffectedByType() == 2 && electric.defenseAffectedByType() == 0.2);
    }

    @Test
    public void ElectricVsWater(){
        opponent = new Water();
        electric.setOpponentType(opponent);

        assertTrue(electric.attackDamageAffectedByType() == -1 && electric.defenseAffectedByType() == -0.2);
    }

}
