package AttackTest;

import com.iteso.nintendo.PokemonType;
import com.iteso.nintendo.types.Psychic;
import com.iteso.nintendo.types.Water;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WaterTest {
    PokemonType pokemonType;

    @Before
    public void setUp(){
       pokemonType = new Water();
    }

    @Test
    public void getTypeTest(){
        Assert.assertEquals("Water", pokemonType.getType());
    }

    @Test
    public void getDefenseMultiplierTest(){
        Assert.assertEquals(0.6, pokemonType.getDefenseMultiplier(), 0.0);
    }

    @Test
    public void getDamageMultiplierTest(){
        Assert.assertEquals(0.51, pokemonType.getDamageMultiplier(), 0.0);
    }
}
