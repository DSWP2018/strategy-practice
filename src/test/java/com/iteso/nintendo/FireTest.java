package com.iteso.nintendo;

import com.iteso.nintendo.implementations.type.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FireTest {
    Fire fire;
    Type opponent;

    @Before
    public void setUp(){
        fire = new Fire();
    }

    @Test
    public void name(){
        assertEquals("Fire", fire.getTypeName());
    }

    @Test
    public void FireVsFire(){
        opponent = new Fire();
        fire.setOpponentType(opponent);

        assertTrue(fire.attackDamageAffectedByType() == 0 && fire.defenseAffectedByType() == 0);
    }

    @Test
    public void FireVsElectric(){
        opponent = new Electric();
        fire.setOpponentType(opponent);

        assertTrue(fire.attackDamageAffectedByType() == -1 && fire.defenseAffectedByType() == 0.2);
    }

    @Test
    public void FireVsNormal(){
        opponent = new Normal();
        fire.setOpponentType(opponent);

        assertTrue(fire.attackDamageAffectedByType() == 4 && fire.defenseAffectedByType() == 0.3);
    }

    @Test
    public void FireVsPlant(){
        opponent = new Plant();
        fire.setOpponentType(opponent);

        assertTrue(fire.attackDamageAffectedByType() == 3 && fire.defenseAffectedByType() == 0.3);
    }

    @Test
    public void FireVsWater(){
        opponent = new Water();
        fire.setOpponentType(opponent);

        assertTrue(fire.attackDamageAffectedByType() == -2 && fire.defenseAffectedByType() == -0.2);
    }

}
