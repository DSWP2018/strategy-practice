package MoveTest;

import com.iteso.nintendo.Moves.Thrash;
import com.iteso.nintendo.Moves.Thunder;
import com.iteso.nintendo.PokemonAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ThrashTest {
    PokemonAttack attack;

    @Before
    public void setUp() {
        attack = new Thrash();
    }

    @Test
    public void attackOpponent() {
        assertEquals("Attacking opponent with Thrash causing a damage of 120", attack.attackOpponent());
    }

    @Test
    public void getAttackName() {
        assertEquals("Thrash", attack.getAttackName());
    }

    @Test
    public void getAttackDamage() {
        assertEquals(120, attack.getAttackDamage());
    }
}
