package MoveTest;

import com.iteso.nintendo.Moves.Spark;
import com.iteso.nintendo.Moves.StompingTantrum;
import com.iteso.nintendo.PokemonAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StompingTantrumTest {
    PokemonAttack attack;

    @Before
    public void setUp() {
        attack = new StompingTantrum();
    }

    @Test
    public void attackOpponent() {
        assertEquals("Attacking opponent with Stomping Tantrum causing a damage of 75", attack.attackOpponent());
    }

    @Test
    public void getAttackName() {
        assertEquals("Stomping Tantrum", attack.getAttackName());
    }

    @Test
    public void getAttackDamage() {
        assertEquals(75, attack.getAttackDamage());
    }
}
