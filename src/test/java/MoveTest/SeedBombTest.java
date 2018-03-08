package MoveTest;

import com.iteso.nintendo.Moves.Confusion;
import com.iteso.nintendo.Moves.SeedBomb;
import com.iteso.nintendo.PokemonAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SeedBombTest {
    PokemonAttack attack;

    @Before
    public void setUp() {
        attack = new SeedBomb();
    }

    @Test
    public void attackOpponent() {
        assertEquals("Attacking opponent with Seed Bomb causing a damage of 80", attack.attackOpponent());
    }

    @Test
    public void getAttackName() {
        assertEquals("Seed Bomb", attack.getAttackName());
    }

    @Test
    public void getAttackDamage() {
        assertEquals(80, attack.getAttackDamage());
    }
}
