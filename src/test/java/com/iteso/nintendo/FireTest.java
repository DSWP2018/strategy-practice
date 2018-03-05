package com.iteso.nintendo;

import com.iteso.nintendo.implementations.type.Fire;
import com.iteso.nintendo.implementations.type.Water;
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
    public void attackFireVsWater(){
        opponent = new Water();
        fire.setOpponentType(opponent);

        assertTrue(fire.attackDamageAffectedByType() == -2);
    }

    @Test
    public void defenceFireVsWater(){
        opponent = new Water();
        fire.setOpponentType(opponent);

        assertTrue(fire.defenseAffectedByType() == -0.2);
    }
}
