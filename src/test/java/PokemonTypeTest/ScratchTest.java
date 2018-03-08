package PokemonTypeTest;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.impl.attacks.ElectroBall;
import com.iteso.nintendo.impl.attacks.Scratch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ScratchTest {
    Attack attack;
    @Before
    public void setUp(){
        attack = new Scratch();
    }

    @Test
    public void getAttackTest(){
        Assert.assertEquals("Scratch", attack.getAttack());
    }

    @Test
    public void getAttackDamage(){
        Assert.assertEquals(40, attack.getAttackDamage());
    }
}
