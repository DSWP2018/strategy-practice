package MoveTest;

import com.iteso.nintendo.Moves.Confusion;
import com.iteso.nintendo.Moves.Thunder;
import com.iteso.nintendo.PokemonAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ThunderTest {
    PokemonAttack attack;

    @Before
    public void setUp() {
        attack = new Thunder();
    }

    @Test
    public void attackOpponent() {
        assertEquals("Attacking opponent with Thunder causing a damage of 110", attack.attackOpponent());
    }

    @Test
    public void getAttackName() {
        assertEquals("Thunder", attack.getAttackName());
    }

    @Test
    public void getAttackDamage() {
        assertEquals(110, attack.getAttackDamage());
    }
}
