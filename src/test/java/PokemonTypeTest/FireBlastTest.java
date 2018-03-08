package PokemonTypeTest;

import com.iteso.nintendo.Attack;
import com.iteso.nintendo.impl.attacks.Acid;
import com.iteso.nintendo.impl.attacks.FireBlast;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FireBlastTest {
    Attack attack;
    @Before
    public void setUp(){
        attack = new FireBlast();
    }

    @Test
    public void getAttackTest(){
        Assert.assertEquals("Fire Blast", attack.getAttack());
    }

    @Test
    public void getAttackDamage(){
        Assert.assertEquals(90, attack.getAttackDamage());
    }
}
