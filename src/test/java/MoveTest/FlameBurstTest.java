package MoveTest;

import com.iteso.nintendo.Moves.FlameBurst;
import com.iteso.nintendo.Moves.Thrash;
import com.iteso.nintendo.PokemonAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FlameBurstTest {
    PokemonAttack attack;

    @Before
    public void setUp() {
        attack = new FlameBurst();
    }

    @Test
    public void attackOpponent() {
        assertEquals("Attacking opponent with Flame Burst causing a damage of 70", attack.attackOpponent());
    }

    @Test
    public void getAttackName() {
        assertEquals("Flame Burst", attack.getAttackName());
    }

    @Test
    public void getAttackDamage() {
        assertEquals(70, attack.getAttackDamage());
    }
}
