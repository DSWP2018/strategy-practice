package AttackTest;

import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.types.Electric;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElectricTest {
    PokemonType pokemonType;

    @Before
    public void setUp(){
       pokemonType = new Electric();
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Electric", pokemonType.getType());
    }

    @Test
    public void getDefenseMultiplierTest(){
        Assert.assertEquals(0.5, pokemonType.getDefenseMultiplier(), 0.0);
    }

    @Test
    public void getDamageMultiplierTest(){
        Assert.assertEquals(0.5, pokemonType.getDamageMultiplier(), 0.0);
    }
}
