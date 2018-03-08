package MoveTest;

import com.iteso.nintendo.Moves.Confusion;
import com.iteso.nintendo.Moves.DragonRage;
import com.iteso.nintendo.PokemonAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DragonRageTest {
    PokemonAttack attack;

    @Before
    public void setUp() {
        attack = new DragonRage();
    }

    @Test
    public void attackOpponent() {
        assertEquals("Attacking opponent with Dragon Rage causing a damage of 100", attack.attackOpponent());
    }

    @Test
    public void getAttackName() {
        assertEquals("Dragon Rage", attack.getAttackName());
    }

    @Test
    public void getAttackDamage() {
        assertEquals(100, attack.getAttackDamage());
    }
}
