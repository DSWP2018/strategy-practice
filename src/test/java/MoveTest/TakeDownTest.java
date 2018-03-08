package MoveTest;

import com.iteso.nintendo.Moves.Spark;
import com.iteso.nintendo.Moves.TakeDown;
import com.iteso.nintendo.PokemonAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TakeDownTest {
    PokemonAttack attack;

    @Before
    public void setUp() {
        attack = new TakeDown();
    }

    @Test
    public void attackOpponent() {
        assertEquals("Attacking opponent with Take Down causing a damage of 90", attack.attackOpponent());
    }

    @Test
    public void getAttackName() {
        assertEquals("Take Down", attack.getAttackName());
    }

    @Test
    public void getAttackDamage() {
        assertEquals(90, attack.getAttackDamage());
    }
}
