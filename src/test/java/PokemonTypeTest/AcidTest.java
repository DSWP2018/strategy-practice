package PokemonTypeTest;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.impl.attacks.Acid;
import com.iteso.nintendo.impl.attacks.Thunder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AcidTest {
    Attack attack;
    @Before
    public void setUp(){
        attack = new Acid();
    }

    @Test
    public void getAttackTest(){
        Assert.assertEquals("Acid", attack.getAttack());
    }

    @Test
    public void getAttackDamage(){
        Assert.assertEquals(90, attack.getAttackDamage());
    }
}
