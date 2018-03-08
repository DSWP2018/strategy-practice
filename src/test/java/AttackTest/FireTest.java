package AttackTest;

import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.types.Fire;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FireTest {
    PokemonType pokemonType;

    @Before
    public void setUp(){
       pokemonType = new Fire();
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Fire", pokemonType.getType());
    }

    @Test
    public void getDefenseMultiplierTest(){
        Assert.assertEquals(0.3, pokemonType.getDefenseMultiplier(), 0.0);
    }

    @Test
    public void getDamageMultiplierTest(){
        Assert.assertEquals(0.7, pokemonType.getDamageMultiplier(), 0.0);
    }
}
