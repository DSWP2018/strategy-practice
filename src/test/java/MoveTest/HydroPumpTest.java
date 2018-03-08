package MoveTest;

import com.iteso.nintendo.Moves.FireBlast;
import com.iteso.nintendo.Moves.HydroPump;
import com.iteso.nintendo.PokemonAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HydroPumpTest {
    PokemonAttack attack;

    @Before
    public void setUp() {
        attack = new HydroPump();
    }

    @Test
    public void attackOpponent() {
        assertEquals("Attacking opponent with Hydro Pump causing a damage of 110", attack.attackOpponent());
    }

    @Test
    public void getAttackName() {
        assertEquals("Hydro Pump", attack.getAttackName());
    }

    @Test
    public void getAttackDamage() {
        assertEquals(110, attack.getAttackDamage());
    }
}
