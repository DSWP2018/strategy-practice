package PokemonTypeTest;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.impl.attacks.ElectroBall;
import com.iteso.nintendo.impl.attacks.FireBlast;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ElectroBallTest {
    Attack attack;
    @Before
    public void setUp(){
        attack = new ElectroBall();
    }

    @Test
    public void getAttackTest(){
        Assert.assertEquals("Electro Ball", attack.getAttack());
    }

    @Test
    public void getAttackDamage(){
        Assert.assertEquals(110, attack.getAttackDamage());
    }
}
