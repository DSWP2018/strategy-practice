package MoveTest;

import com.iteso.nintendo.Moves.Confusion;
import com.iteso.nintendo.PokemonAttack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ConfusionTest {
    PokemonAttack attack;

    @Before
    public void setUp() {
        attack = new Confusion();
    }

    @Test
    public void attackOpponent() {
        assertEquals("Attacking opponent with Confusion causing a damage of 50", attack.attackOpponent());
    }

    @Test
    public void getAttackName() {
        assertEquals("Confusion", attack.getAttackName());
    }

    @Test
    public void getAttackDamage() {
        assertEquals(50, attack.getAttackDamage());
    }
}
