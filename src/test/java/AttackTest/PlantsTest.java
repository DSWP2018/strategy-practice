package AttackTest;

import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.types.Electric;
import com.iteso.nintendo.types.Plants;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlantsTest {
    PokemonType pokemonType;

    @Before
    public void setUp(){
       pokemonType = new Plants();
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Plants", pokemonType.getType());
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
