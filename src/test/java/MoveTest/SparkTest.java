package MoveTest;

import com.iteso.nintendo.Moves.Confusion;
import com.iteso.nintendo.Moves.Spark;
import com.iteso.nintendo.PokemonAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SparkTest {
    PokemonAttack attack;

    @Before
    public void setUp() {
        attack = new Spark();
    }

    @Test
    public void attackOpponent() {
        assertEquals("Attacking opponent with Spark causing a damage of 65", attack.attackOpponent());
    }

    @Test
    public void getAttackName() {
        assertEquals("Spark", attack.getAttackName());
    }

    @Test
    public void getAttackDamage() {
        assertEquals(65, attack.getAttackDamage());
    }
}
