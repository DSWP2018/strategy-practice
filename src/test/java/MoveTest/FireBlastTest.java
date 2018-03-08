package MoveTest;

import com.iteso.nintendo.Moves.DragonRage;
import com.iteso.nintendo.Moves.FireBlast;
import com.iteso.nintendo.PokemonAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FireBlastTest {
    PokemonAttack attack;

    @Before
    public void setUp() {
        attack = new FireBlast();
    }

    @Test
    public void attackOpponent() {
        assertEquals("Attacking opponent with Fire Blast causing a damage of 110", attack.attackOpponent());
    }

    @Test
    public void getAttackName() {
        assertEquals("Fire Blast", attack.getAttackName());
    }

    @Test
    public void getAttackDamage() {
        assertEquals(110, attack.getAttackDamage());
    }
}
