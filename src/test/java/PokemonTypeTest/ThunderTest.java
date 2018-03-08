package PokemonTypeTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.iteso.nintendo.Attack;
import com.iteso.nintendo.impl.attacks.Thunder;


public class ThunderTest {
    Attack attack;
    @Before
    public void setUp(){
        attack = new Thunder();
    }

    @Test
    public void getAttackTest(){
        Assert.assertEquals("Thunder", attack.getAttack());
    }

    @Test
    public void getAttackDamage(){
        Assert.assertEquals(110, attack.getAttackDamage());
    }
}
