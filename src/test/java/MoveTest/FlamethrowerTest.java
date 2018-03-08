package MoveTest;

import com.iteso.nintendo.Moves.Flamethrower;
import com.iteso.nintendo.Moves.Thunder;
import com.iteso.nintendo.PokemonAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FlamethrowerTest {
    PokemonAttack attack;

    @Before
    public void setUp() {
        attack = new Flamethrower();
    }

    @Test
    public void attackOpponent() {
        assertEquals("Attacking opponent with Flamethrower causing a damage of 90", attack.attackOpponent());
    }

    @Test
    public void getAttackName() {
        assertEquals("Flamethrower", attack.getAttackName());
    }

    @Test
    public void getAttackDamage() {
        assertEquals(90, attack.getAttackDamage());
    }
}
